/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bluq1
 */
public class Event {

    private String id;
    private Date date;
    private String sport;
    private String place;

    public Event() {
    }

    public Event(String id, Date date, String sport, String place) {
        this.id = id;
        this.date = date;
        this.sport = sport;
        this.place = place;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", date=" + date + ", sport=" + sport + ", description=" + place + '}';
    }

    public static final Event NULL_EVENT = new Event() {
        @Override
        public String getId() {
            return "0";
        }

        @Override
        public Date getDate() {
            return Calendar.getInstance().getTime();
        }

        @Override
        public String getSport() {
            return "NULL SPORT";
        }

        @Override
        public String getPlace() {
            return "NULL PLACE";
        }

    };

    public static class EventBuilder implements IBuilder<Event> {

        private String id;
        private Date date;
        private String sport;
        private String place;

        public EventBuilder() {
        }

        public EventBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public EventBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public EventBuilder setSport(String sport) {
            this.sport = sport;
            return this;
        }

        public EventBuilder setPlace(String place) {
            this.place = place;
            return this;
        }

        @Override
        public Event build() {
            return new Event(id, date, sport, place);
        }

    }
}
