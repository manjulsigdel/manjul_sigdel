/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ce.controller;

import com.leapfrog.ce.dao.EnquaryDAO;
import com.leapfrog.ce.entity.Course;
import com.leapfrog.ce.entity.Enquary;
import java.util.Scanner;

/**
 *
 * @author MANJUL
 */
public class EnquaryController {
    
    Scanner input1;
    private EnquaryDAO enquaryDAO;

    public EnquaryController(Scanner input1, EnquaryDAO enquaryDAO) {
        this.input1 = input1;
        this.enquaryDAO = enquaryDAO;
    }
    
   

    public void menu() {
        System.out.println("1. Add Enquiry");
        System.out.println("2. Delete Enquiry");
        System.out.println("3. Search Enquiry by Id ");
        System.out.println("4. Show all Enquiry ");
        System.out.println("5. Back");
        System.out.println("Enter your Choise[1-5]");
    }
    
     public void process() {
        menu();
        switch (input1.nextInt()) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
    
     public void add() {
        while (true) {
            Enquary enquary = new Enquary();
            System.out.println("Enter enquiry id");
            enquary.setId(input1.nextInt());
            System.out.println("Enter First Name");
            enquary.setFirstName(input1.next());
            System.out.println("Enter Last Name");
            enquary.setLastName(input1.next());
            System.out.println("Enter Email");
            enquary.setEmail(input1.next());
            System.out.println("Enter contact no");
            enquary.setContactNo(input1.next());
            System.out.println("choose a course from following list:");
            enquaryDAO.insert(enquary);

            System.out.println("Do you want to Add more?[Y/N]");

        }
    }

    public void delete() {
        System.out.println("Enter id to delete");
            int id = input1.nextInt();
            enquaryDAO.delete(id);
    }

    public void showById() {
          System.out.println("Enter id to see the details");
            int id = input1.nextInt();
            enquaryDAO.getById(id);
    }

    public void showAll() {
        enquaryDAO.getAll().forEach(c -> {
            System.out.println(c.toString());
        });
    }
    
    
    
   
}
