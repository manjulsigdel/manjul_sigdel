/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.dao.impl;

import com.leapfrog.ce.dao.EnquaryDAO;
import com.leapfrog.ce.entity.Enquary;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANJUL
 */
public class EnquaryDAOImpl implements EnquaryDAO{
    private List<Enquary> enquaryList = new ArrayList<>();
    @Override
    public boolean insert(Enquary e) {
        return enquaryList.add(e);
        
    }

    @Override
    public List<Enquary> getAll() {
        return enquaryList;
    }

    @Override
    public boolean delete(int id) {
        Enquary e= getById(id);
        if(e!=null){
        enquaryList.remove(e);
        return true;
    }
        return false;
    }

    @Override
    public Enquary getById(int id) {   
        for(Enquary e:enquaryList){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }
    
}
