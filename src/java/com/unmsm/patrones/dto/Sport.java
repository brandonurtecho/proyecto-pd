/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

/**
 *
 * @author bluq1
 */
public abstract class Sport {
    private String id;
    private String title;
    private String overView;
    private String history;
    private String image;

    public Sport() {
    }

    public Sport(String id, String title, String overView, String history, String image) {
        this.id = id;
        this.title = title;
        this.overView = overView;
        this.history = history;
        this.image = image;
    }
    
    public static final Sport NULL_SPORT = new Sport() {
        @Override
        public String getId() {
            return "0";
        }

        @Override
        public String getTitle() {
            return "NULL TITLE";
        }

        @Override
        public String getOverView() {
            return "NULL OVERVIEW";
        }

        @Override
        public String getHistory() {
            return "NULL HISTORY";
        }    
        
        @Override
        public String getImage() {
            return "assets/img/NOT_FOUND.jpg";
        }

        @Override
        public String getType() {
            return "NULL TYPE";
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

    public String getOverView() {
        return overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Sport{" + "id=" + id + ", title=" + title + ", overView=" + overView + ", history=" + history + ", image=" + image + '}';
    }
    
}
