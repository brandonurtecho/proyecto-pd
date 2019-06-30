/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.util.iterator;

import com.unmsm.patrones.dto.Commentary;

/**
 *
 * @author diego
 */
public class RuleIterator implements CustomIterator<Commentary> {

    private ListCommentary aggregate;
    private int current = 0;

    // Constructor 
    public RuleIterator(ListCommentary aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Commentary first() {
        return aggregate.getItem(0);
    }

    @Override
    public Commentary next() {
        Commentary ret = Commentary.NULL_COMMENTARY;
        ret = aggregate.getItem(current);
        current++;
        return ret;
    }

    @Override
    public Commentary currentItem() {
        return aggregate.getItem(current);
    }

    @Override
    public boolean isDone() {
        if (current >= aggregate.count()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int size() {
        return aggregate.count();
    }
}
