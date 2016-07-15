/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fiop.dao.impl;

import com.leapfrog.fiop.dao.EmployeeDAO;
import com.leapfrog.fiop.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANJUL
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    private List<Employee> employeeList = new ArrayList<>();
    @Override
    public int insert(Employee e) {
        employeeList.add(e);
        return 1;
    }

    @Override
    public int update(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        Employee e =getById(id);
        if(e!=null){
            employeeList.remove(e);
            return 1;
        }
        return 0;
    }

    @Override
    public Employee getById(int id) {
        for(Employee e:employeeList){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
    
}
