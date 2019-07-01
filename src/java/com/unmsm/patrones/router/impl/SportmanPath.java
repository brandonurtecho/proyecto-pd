/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.router.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.dto.Payment;
import com.unmsm.patrones.dto.Sportsman;
import com.unmsm.patrones.dto.User;
import com.unmsm.patrones.router.PathStrategy;
import com.unmsm.patrones.service.facade.impl.UserFacadeService;
import com.unmsm.patrones.util.Cast;
import com.unmsm.patrones.util.Jsp;
import com.unmsm.patrones.util.PathName;
import com.unmsm.patrones.util.iterator.CustomIterator;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LaboratorioFISI
 */
public class SportmanPath extends PathStrategy {

    public SportmanPath(String path) {
        super(path);
    }

    @Override
    public Boolean isMatch(String path) {
        return path.equals(PathName.SPORTMAN);
    }

    @Override
    public void operation(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        UserFacadeService service = new UserFacadeService();

        String sport = request.getParameter("Sport");
        request.getSession().setAttribute("sport", sport);

        System.out.println(sport);

        if (sport != null) {
            updateCommentaryOrLike(request, response, service, sport);
        }

        String commentary = request.getParameter("commentary");
        String like = request.getParameter("like");

        if (commentary != null) {
            User user = (User) request.getSession().getAttribute("userOn");
            Commentary comment = new Commentary.CommentaryBuilder()
                    .setBody(request.getParameter("comment"))
                    .setDate(new Date())
                    .setLike(0)
                    .setSport(sport)
                    .setEmailUser(user.getEmail())
                    .setNameUser(user.getName())
                    .setLastNameUser(user.getLastname())
                    .build();
            service.commentary(comment, "CREATE");
            updateCommentaryOrLike(request, response, service, sport);
        } else if (like != null) {
            String[] likecomment = request.getParameter("likecomment").split("::");
            try {
                Commentary commentlike = new Commentary.CommentaryBuilder()
                        .setId(likecomment[0])
                        .setEmailUser(likecomment[1])
                        .setNameUser(likecomment[2])
                        .setLastNameUser(likecomment[3])
                        .setDate(Cast.stringToDate(likecomment[4]))
                        .setBody(likecomment[5])
                        .setLike(Integer.parseInt(likecomment[6]))
                        .setSport(likecomment[7])
                        .build();
                service.commentary(commentlike, "LIKE");
                updateCommentaryOrLike(request, response, service, sport);
            } catch (ParseException ex) {
                Logger.getLogger(SportmanPath.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(Jsp.SPORTMAN);
        dispatcher.forward(request, response);
    }

    private void updateCommentaryOrLike(HttpServletRequest request, HttpServletResponse response, UserFacadeService service, String sport) 
                                    throws ServletException, IOException, SQLException {
        List<Sportsman> sportmanlist = service.showSportsmanBySportInSport(sport);
        CustomIterator it = service.showCommentaryBySportInSport(sport, "LIKE");
        Cast cast = new Cast();
        request.setAttribute("sportmanlist", sportmanlist);
        request.setAttribute("it", it);
        request.setAttribute("cast", cast);
    }

}
