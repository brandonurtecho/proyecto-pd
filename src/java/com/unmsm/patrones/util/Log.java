/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author bluq1
 */
public class Log {

    private static Log instance;

    private PrintWriter out;
    private DateFormat dt;
    private static final String FILENAME = "transactions.txt";

    private Log() {
        try {
            out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(FILENAME, true)), true);
            dt = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.DEFAULT, new Locale("es", "ES"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public synchronized Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public synchronized void addLine(String msg) {
        out.print(dt.format(new Date()));
        out.println(": " + msg);
    }

    public BufferedReader getContent() {
        BufferedReader result = null;
        try {
            result = new BufferedReader(new FileReader(FILENAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}