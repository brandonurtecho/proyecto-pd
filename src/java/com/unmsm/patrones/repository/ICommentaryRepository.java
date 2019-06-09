/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository;

import com.unmsm.patrones.dto.Commentary;

/**
 *
 * @author diego
 */
public interface ICommentaryRepository extends ICommentaryReadeable {
    void insert(Commentary commentary);
    long update(Commentary commentary);
    long delete(String id);
}
