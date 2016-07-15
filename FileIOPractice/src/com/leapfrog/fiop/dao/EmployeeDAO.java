/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fiop.dao;

import com.leapfrog.fiop.entity.Employee;
import java.util.List;

/**
 *
 * @author MANJUL
 */
public interface EmployeeDAO {
    int insert(Employee e);
    int update(Employee e);
    int delete(int id);
    Employee getById(int id);
    List<Employee> getAll();
}
