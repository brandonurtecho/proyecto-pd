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
public interface CustomIterator<T> {
    
    public abstract T first();
    public abstract T next();
    public abstract int size();
    public abstract boolean isDone();
    public abstract T currentItem();
}
