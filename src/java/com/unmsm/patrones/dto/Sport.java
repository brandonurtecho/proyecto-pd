/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.List;

/**
 *
 * @author bluq1
 */
public class Sport {
    private String title;
    private String overView;
    private String history;
    private List<Event> eventList;

    public Sport() {
    }

    public Sport(String title, String overView, String history, List<Event> eventList) {
        this.title = title;
        this.overView = overView;
        this.history = history;
        this.eventList = eventList;
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

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public String toString() {
        return "Sport{" + "title=" + title + ", overView=" + overView + ", history=" + history + ", eventList=" + eventList + '}';
    }
    
}
