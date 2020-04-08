/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import teacher.dbutil.DBConnection;
import teacher.pojo.Assignment;

/**
 *
 * @author aman
 */
public class AssignmentDAO {

    public static Assignment getAssignmentDetails(String title, String sid) throws SQLException {
        Assignment a = new Assignment();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from Assignment where title=? and subject_id=? ");
        ps.setString(1, title);
        ps.setString(2, sid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        a.setAssignment_id(rs.getString(1));
        a.setSubject_id(sid);
        a.setTitle(title);
        a.setQuestion(rs.getString(4));
        return a;
    }

    public static void addassignment(String aid, String title, String qsn, String sid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into assignment values(?,?,?,?)");
        ps.setString(1, aid);
        ps.setString(2, sid);
        ps.setString(3, qsn);
        ps.setString(4, title);
        ResultSet rs = ps.executeQuery();
    }

    public static void removeassignment(String title, String tid, String sid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from assignment where subject_id=?  and title=?");
        ps.setString(1, sid);

        ps.setString(2, title);
        ResultSet rs = ps.executeQuery();
    }

    public static TableModel getassignmentmodel(String assignment_id, int sem) throws SQLException {
        DefaultTableModel tableModel = new DefaultTableModel(new String [] {"Roll no.", "Name", "Marks","Submitted"},0);
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT newstudent.roll_no,newstudent.firstname,newsubmitted.marks FROM (Select * from student where sem=?) newstudent LEFT OUTER JOIN (select * from submitted where assignment_id=?) newsubmitted ON newstudent.roll_no = newsubmitted.roll_no");
        ps.setString(2, assignment_id);
        ps.setInt(1, sem);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String sub = (rs.getString(2)==null) ? "not submitted" : "submitted";
            tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getInt(3), sub});
        }

        return tableModel; //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList getsolution(String roll_no, String assignment_id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        ArrayList l = new ArrayList();
        PreparedStatement ps = conn.prepareStatement("select solution,marks from submitted where roll_no=? and assignment_id=?");
        ps.setString(1, roll_no);
        ps.setString(2, assignment_id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        l.add(rs.getString(1));
        l.add(rs.getInt(2));
        //To change body of generated methods, choose Tools | Templates.
        return l;
    }

    public static void setmarks(String marks, String roll_no, String assignment_id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update  submitted set marks=? where roll_no=? and assignment_id=?");
        ps.setString(1, marks);
        ps.setString(2, roll_no);
        ps.setString(3, assignment_id);
        ps.executeQuery();//To change body of generated methods, choose Tools | Templates.
    }
}
