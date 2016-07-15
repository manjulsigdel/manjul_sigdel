/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.entity;

/**
 *
 * @author MANJUL
 */
public class Course {
    private int id;
    private String courseName;
    private String descreption;

    public Course() {
    }

    public Course(int id,String courseName, String descreption) {
        this.id=id;
        this.courseName = courseName;
        this.descreption=descreption;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", courseName=" + courseName + ", descreption=" + descreption + '}';
    }
    
}
