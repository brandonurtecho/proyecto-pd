/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.util.iterator;

/**
 *
 * @author diego
 */
public interface CustomList<T> {
    CustomIterator iterator();
    CustomIterator iterator(String sort);
}
