/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jjapp.dao.impl;

import com.leapfrog.jjapp.dao.CourseDAO;
import com.leapfrog.jjapp.dbutil.DBConnection;
import com.leapfrog.jjapp.entity.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manjul
 */
public class CourseDAOImpl implements CourseDAO {

    private DBConnection db = new DBConnection();

    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
        List<Course> courseList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_courses";
        db.open();
        db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while (rs.next()) {
            Course c = new Course();
            c.setId(rs.getInt("course_id"));
            c.setName(rs.getString("course_name"));
            c.setFees(rs.getInt("fees"));
            c.setStatus(rs.getBoolean("status"));

            courseList.add(c);
        }
        return courseList;
    }

    @Override
    public Course getById(int id) throws ClassNotFoundException, SQLException {
        Course c=null;
        String sql="SELECT * FROM tbl_courses WHERE course_id=?";
        db.open();
        PreparedStatement stmt=db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.executeQuery();
        while(rs.next()){
            c=new Course();
            c.setId(rs.getInt("course_id"));
            c.setName(rs.getString("course_name"));
            c.setFees(rs.getDouble("fees"));
            c.setStatus(rs.getBoolean("status"));
            
        }
        db.close();
        return c;
    }

    @Override
    public int insert(Course c) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_courses (course_name,fees,status) VALUES(?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, c.getName());
        stmt.setDouble(2, c.getFees());
        stmt.setBoolean(3, c.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(Course c) throws ClassNotFoundException, SQLException {
        db.open();
        String sql="UPDATE tbl_courses SET course_name=?,fees=?,status=? WHERE course_id=?";
        PreparedStatement stmt =db.initStatement(sql);
        stmt.setString(1, c.getName());
        stmt.setDouble(2, c.getFees());
        stmt.setBoolean(3, c.isStatus());
        stmt.setInt(4, c.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        db.open();
        String sql="DELETE FROM tbl_courses WHERE id=?";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

}
