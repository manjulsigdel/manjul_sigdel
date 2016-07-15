/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.controller;

import com.leapfrog.ce.dao.CourseDAO;
import com.leapfrog.ce.entity.Course;
import java.util.Scanner;

/**
 *
 * @author MANJUL
 */
public class CourseController {

    Scanner input;
    private CourseDAO courseDAO;

    public CourseController(Scanner input, CourseDAO courseDAO) {
        this.input = input;
        this.courseDAO = courseDAO;
    }

    public void menu() {
        System.out.println("1. Add course");
        System.out.println("2. Delete Course");
        System.out.println("3. Show by Id");
        System.out.println("4. Show All");
        System.out.println("5. Back");
        System.out.println("Enter your choise[1-5]");

    }

    public void process() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                showById();
                break;
            case 4:
                showAll();
                break;
            case 5:
                break;
        }
    }

    public void add() {
        while (true) {
            Course course = new Course();
            System.out.println("Enter Course Id");
            course.setId(input.nextInt());
            System.out.println("Enter Course Name");
            course.setCourseName(input.next());
            System.out.println("Enter Course Descreption");
            course.setDescreption(input.next());
            courseDAO.insert(course);

            System.out.println("Do you want to Add more?[Y/N]");

        }
    }

    public void delete() {
        System.out.println("Enter id to delete");
        int id = input.nextInt();
        courseDAO.delete(id);
    }

    public void showById() {
        System.out.println("Enter id to see the details");
        int id = input.nextInt();
        courseDAO.getById(id);
    }

    public void showAll() {
        courseDAO.getAll().forEach(c -> {
            System.out.println(c.toString());
        });
    }

}
