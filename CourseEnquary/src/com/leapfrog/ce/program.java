/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */m
package com.leapfrog.ce;

import com.leapfrog.ce.controller.CourseController;
import com.leapfrog.ce.controller.EnquaryController;
import com.leapfrog.ce.dao.CourseDAO;
import com.leapfrog.ce.dao.EnquaryDAO;
import com.leapfrog.ce.dao.impl.CourseDAOImpl;
import com.leapfrog.ce.dao.impl.EnquaryDAOImpl;

import java.util.Scanner;

/**
 *
 * @author MANJUL
 */
public class program {
    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
      
       CourseDAO courseDAO = new CourseDAOImpl();
       Scanner input = new Scanner(System.in);
       CourseController courseController = new CourseController(input, courseDAO);
       while(true) {
           courseController.process();
       }
                
            
          
        EnquaryDAO enquaryDAO = new EnquaryDAOImpl();
        Scanner input1 = new Scanner(System.in);
        EnquaryController enquaryController = new EnquaryController(input1, enquaryDAO);
        while (true) {
            enquaryController.process();
        }

    }

}


