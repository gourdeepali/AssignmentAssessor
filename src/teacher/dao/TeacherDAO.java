/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.dao;

import teacher.dbutil.DBConnection;
import teacher.pojo.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class TeacherDAO {

    public static boolean validate(String user, String pass) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select pwd,name from teacher where teacher_id=?");
        ps.setString(1, user);
        ResultSet rs = ps.executeQuery();
        boolean r = false;
        rs.next();
        if (rs.getString(1).equals(pass)) {
            r = true;
        } else {
            r = false;
        }

        return r;

    }

    public static Teacher getTeacherDetails(String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from teacher where teacher_id=?");
        Teacher tr = new Teacher();
        ps.setString(1, tid);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            tr.setTeacher_id(tid);
            tr.setName(rs.getString(1));
            tr.setTeacher_id(rs.getString(2));
            tr.setBranch(rs.getString(3));
            tr.setEmail(rs.getString(4));
            tr.setMob(rs.getString(5));
            tr.setGender(rs.getString(6));
            tr.setDob(rs.getString(7));
            tr.setPwd(rs.getString(8));

        }
        return tr;
    }

    public static ArrayList<String> getTeacherSubject(String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select subject_name from teacher_subject where teacher_id=?");
        ps.setString(1, tid);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> al = new ArrayList();
        while (rs.next()) {
            al.add(rs.getString(1));
        }
        return al;
    }

    public static ArrayList<String> getTeacherAssignment( String sid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select title from Assignment where subject_id=?");
        
        ps.setString(1, sid);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> al = new ArrayList();
        while (rs.next()) {
            al.add(rs.getString(1));
        }
        return al;
    }

    public static void setpassword(String n,String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update teacher set pwd=? where teacher_id=?");
        ps.setString(1, n);
        ps.setString(2, tid);
        ps.executeQuery();//To change body of generated methods, choose Tools | Templates.
    }

}
