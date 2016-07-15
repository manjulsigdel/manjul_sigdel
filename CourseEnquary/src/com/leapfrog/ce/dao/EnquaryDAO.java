/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.dao;

import com.leapfrog.ce.entity.Enquary;
import java.util.List;

/**
 *
 * @author MANJUL
 */
public interface EnquaryDAO {
    boolean insert(Enquary e);
    boolean delete(int id);
    Enquary getById(int id);
    List<Enquary> getAll();
    
    
}
