/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author bluq1
 */
public class Commentary {
    private String id;
    private String title;
    private Date date;
    private String body;
    private Integer like;
    private String sport;

    public Commentary() {
    }

    public Commentary(String id, String title, Date date, String body, Integer like, String sport) {
        this.id = id;
        this.title = title;
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
        public String getTitle() {
            return "NULL TITLE";
        }
        
        @Override
        public Date getDate() {
            return Date.from(Instant.MIN);
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Commentary{" + "id=" + id + ", title=" + title + ", date=" + date + ", body=" + body + ", like=" + like + ", sport=" + sport + '}';
    }
    
    public static class CommentaryBuilder implements IBuilder<Commentary> {
        private String id;
        private String title;
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

        public CommentaryBuilder setTitle(String title) {
            this.title = title;
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
        
        @Override
        public Commentary build() {
            return new Commentary(id, title, date, body, like, sport);
        }
        
    }
    
}
