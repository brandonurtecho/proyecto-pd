/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository;

import com.unmsm.patrones.dto.Admin;

/**
 *
 * @author diego
 */
public interface IAdminRepository extends IAdminReadeable {
    long update(Admin admin);
}
