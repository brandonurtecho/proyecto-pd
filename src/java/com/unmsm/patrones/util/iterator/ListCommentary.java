/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.util.iterator;

import com.unmsm.patrones.dto.Commentary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author diego
 */
public class ListCommentary implements CustomList<Commentary> {

    private List<Commentary> items;

    public ListCommentary() {
    }

    public ListCommentary(List<Commentary> list) {
        this.items = list;
    }

    @Override
    public CustomIterator iterator() {
        return new RuleIterator(this);
    }

    @Override
    public CustomIterator iterator(String sort) {
        switch (sort) {
            case "LIKE":
                Collections.sort(items, (o1, o2) -> o2.getLike().compareTo(o1.getLike()));
                break;
            case "DATE":
                Collections.sort(items, (o1, o2) -> o2.getDate().compareTo(o1.getDate()));
                break;
            default: break;
        }
        return new RuleIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Commentary getItem(int index) {
        return items.get(index);
    }

    public void setItem(int index, Commentary value) {
        items.add(index, value);
    }
    
    public void setItem(Commentary value){
        items.add(value);
    }
}
