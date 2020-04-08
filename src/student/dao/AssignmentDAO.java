/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import teacher.dbutil.DBConnection;
import student.pojo.Assignment;

/**
 *
 * @author aman
 */
public class AssignmentDAO {

    public static Assignment getAssignmentDetails(String title, String sid) throws SQLException {
        Assignment a = new Assignment();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Assignment where title=? and subject_id=?");
        ps.setString(1, title);
        ps.setString(2, sid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        a.setAssignment_id(rs.getString(1));
        a.setSubject_id(sid);
        a.setTitle(title);
        a.setQuestion(rs.getString(3));
        return a;
    }
//column name dena hai isme
    public static DefaultTableModel getassignemntmodel(String sub_id) throws SQLException {
        DefaultTableModel tableModel = new DefaultTableModel(new String [] {"Assignment", "Marks", "Submitted"},0);
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT newassignment.title,submitted.marks FROM (select * from assignment where subject_id=?) newassignment LEFT OUTER  JOIN Submitted ON newassignment.Assignment_id = submitted.assignment_id");  
        ps.setString(1, sub_id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String sub = (rs.getString(2)==null) ? "not submitted" : "submitted";
            tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2), sub});
        }

        return tableModel;

    }

    public static String getsolution(String assignment_id) throws SQLException {
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select solution from submitted where assignment_id=? ");
        ps.setString(1, assignment_id);
        ResultSet rs = ps.executeQuery();
        if(rs.next())
        return rs.getString(1);
        else
            return "";

        //To change body of generated methods, choose Tools | Templates.
    }

    public static void setsolution(String assignment_id, String roll_no, String sol, String subject_id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into submitted values(?,?,?,?,?)");
        ps.setString(1, assignment_id);
        ps.setString(2, roll_no);
        ps.setString(3, sol);
        ps.setInt(4, -1);
        ps.setString(5, subject_id);
        ps.executeQuery();
        //To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.
}

