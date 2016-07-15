/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fiop;

import com.leapfrog.fiop.dao.EmployeeDAO;
import com.leapfrog.fiop.dao.impl.EmployeeDAOImpl;
import com.leapfrog.fiop.entity.Employee;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author MANJUL
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            /* For downloading pictures from given URL */
            BufferedReader reader = new BufferedReader(new FileReader("e:/icons.csv"));
            String line = "";
            int counter = 1;
            if ((line = reader.readLine()) != null) {

                URL url = new URL(line);
                URLConnection conn = url.openConnection();
                String name = "file_";

                InputStream is = conn.getInputStream();

                FileOutputStream os = new FileOutputStream("e:/" + name + counter + ".png");
                byte[] data = new byte[1024];
                int i = 0;
                while ((i = is.read(data)) != -1) {
                    os.write(data, 0, i);
                }
                is.close();
                os.close();
                counter++;
            }

            /*For copying csv file from one file to another by filtering it*/
            /*
             BufferedReader reader = new BufferedReader(new FileReader("d:/helloworld.txt"));
             String line="";
             EmployeeDAO empDAO = new EmployeeDAOImpl();
             while((line=reader.readLine())!=null){
             String[] tokens=line.split(",");
             if(tokens.length>=4){
             Employee employee = new Employee();
             employee.setId(Integer.parseInt(tokens[0]));
             employee.setFirstName(tokens[1]);
             employee.setLastName(tokens[2]);
             employee.setEmail(tokens[3]);
             employee.setContactNo(tokens[4]);
                
             empDAO.insert(employee);
                
             }
             }
        
             reader.close();
        
             FileWriter  writer = new FileWriter("d:/processed.csv");
             StringBuilder builder = new StringBuilder();
             for(Employee e:empDAO.getAll()){
             builder.append(e.toCSV());
             }
             writer.write(builder.toString());
             writer.close();
             */
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
