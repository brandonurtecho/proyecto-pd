/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.Cast;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bluq1
 */
public class Commentary {
    private String id;
    private String emailUser;
    private String nameUser;
    private String lastNameUser;
    private Date date;
    private String body;
    private Integer like;
    private String sport;

    public Commentary() {
    }

    public Commentary(String id, String emailUser, String nameUser, String lastNameUser, Date date, String body, Integer like, String sport) {
        this.id = id;
        this.emailUser = emailUser;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.date = date;
        this.body = body;
        this.like = like;
        this.sport = sport;
    }

    public static final Commentary NULL_COMMENTARY = new Commentary() {
        @Override
        public String getId() {
            return "0";
        }

        @Override
        public String getEmailUser() {
            return "NULL EMAIL";
        }
        
        @Override
        public Date getDate() {
            return Calendar.getInstance().getTime();
        }

        @Override
        public String getBody() {
            return "NULL BODY";
        }

        @Override
        public Integer getLike() {
            return 0;
        }

        @Override
        public String getSport() {
            return "NULL SPORT";
        }
    
    };
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    @Override
    public String toString() {
        //return "Commentary{" + "id=" + id + ", emailUser=" + emailUser + ", nameUser=" + nameUser + ", lastNameUser=" + lastNameUser + ", date=" + date + ", body=" + body + ", like=" + like + ", sport=" + sport + '}';
        return id + "::" + emailUser + "::" + nameUser + "::" + lastNameUser + "::" + Cast.dateToString(date) + "::" + body + "::"+ like + "::" + sport;
    }
    
    public static class CommentaryBuilder implements IBuilder<Commentary> {
        private String id;
        private String emailUser;
        private String nameUser;
        private String lastNameUser;
        private Date date;
        private String body;
        private Integer like;
        private String sport;

        public CommentaryBuilder() {
        }

        public CommentaryBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public CommentaryBuilder setEmailUser(String emailUser) {
            this.emailUser = emailUser;
            return this;
        }

        public CommentaryBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public CommentaryBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public CommentaryBuilder setLike(Integer like) {
            this.like = like;
            return this;
        }

        public CommentaryBuilder setSport(String sport) {
            this.sport = sport;
            return this;
        }

        public CommentaryBuilder setNameUser(String nameUser) {
            this.nameUser = nameUser;
            return this;
        }

        public CommentaryBuilder setLastNameUser(String lastNameUser) {
            this.lastNameUser = lastNameUser;
            return this;
        }
        
        @Override
        public Commentary build() {
            return new Commentary(id, emailUser, nameUser, lastNameUser, date, body, like, sport);
        }
        
    }
    
}
