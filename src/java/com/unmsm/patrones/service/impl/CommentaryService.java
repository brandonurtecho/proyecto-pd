/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.repository.ICommentaryRepository;
import com.unmsm.patrones.repository.impl.CommentaryDao;
import com.unmsm.patrones.service.ICommentaryService;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class CommentaryService implements ICommentaryService{
    
    private ICommentaryRepository commentaryRepository;

    public CommentaryService() {
        this.commentaryRepository = new CommentaryDao();
    }
    
    @Override
    public List<Commentary> showAllComentaries() {
        return this.commentaryRepository.getAll();
    }

    @Override
    public List<Commentary> showCommentaryBySport(String sport) {
        return this.commentaryRepository.getBySport(sport);
    }

    @Override
    public Boolean createCommentary(Commentary commentary) {
        this.commentaryRepository.insert(commentary);
        return Boolean.TRUE;
    }

    @Override
    public Boolean likeCommentary(Commentary commentary) {
        commentary.setLike(commentary.getLike()+1);
        long flag = this.commentaryRepository.update(commentary);
        return flag != 0;
    }

    @Override
    public Boolean deleteCommentary(Commentary commentary) {
        long flag = this.commentaryRepository.delete(commentary);
        return flag != 0;
    }
    
}
