/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.dao.impl;

import com.leapfrog.ce.dao.CourseDAO;
import com.leapfrog.ce.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANJUL
 */
public class CourseDAOImpl implements CourseDAO{
    private List<Course> courseList = new ArrayList<>();
    @Override
    public boolean insert(Course c) {
        return courseList.add(c);
    }

    @Override
    public boolean delete(int id) {
        Course c=getById(id);
        if(c!=null){
            courseList.remove(c);
            return true;
        }
        return false;
    }

    @Override
    public Course getById(int id) {
        for(Course c: courseList){
            if(c.getId()==id){
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }
    
}
