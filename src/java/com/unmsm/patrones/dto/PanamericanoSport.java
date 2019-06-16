/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.dto;

import com.unmsm.patrones.util.TypeSport;

/**
 *
 * @author diego
 */
public class PanamericanoSport extends Sport {
    public static final PanamericanoSport NULL_PANAMERICANO_SPORT = new PanamericanoSport() {
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
        public String getType() {
            return "NULL TYPE";
        }
    };

    @Override
    public String getType() {
        return TypeSport.PANAMERICANO_SPORT;
    }

}
