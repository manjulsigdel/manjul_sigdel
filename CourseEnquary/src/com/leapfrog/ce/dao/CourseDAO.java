/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.dao;

import com.leapfrog.ce.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANJUL
 */
public interface CourseDAO {
    boolean insert(Course c);
    boolean delete(int id);
    Course getById(int id); 
    List<Course> getAll();
    
    
}
