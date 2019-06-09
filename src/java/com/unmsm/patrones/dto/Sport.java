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
public class Sport {
    private String id;
    private String title;
    private String overView;
    private String history;    

    public Sport() {
    }

    public Sport(String id, String title, String overView, String history) {
        this.id = id;
        this.title = title;
        this.overView = overView;
        this.history = history;
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

    public static class SportBuilder implements IBuilder<Sport> {
        private String id;
        private String title;
        private String overView;
        private String history;    

        public SportBuilder() {
        }

        public SportBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public SportBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public SportBuilder setOverView(String overView) {
            this.overView = overView;
            return this;
        }

        public SportBuilder setHistory(String history) {
            this.history = history;
            return this;
        }
        
        @Override
        public Sport build() {
            return new Sport(id, title, overView, history);
        }
        
    }
}
