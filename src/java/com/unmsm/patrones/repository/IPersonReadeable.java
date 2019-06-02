/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.repository;

import com.unmsm.patrones.dto.Person;
import java.util.List;

/**
 *
 * @author bluq1
 * @param <T>
 */
public interface IPersonReadeable<T extends Person> {
    List<T> findByCountryName(String nameParam);
}
