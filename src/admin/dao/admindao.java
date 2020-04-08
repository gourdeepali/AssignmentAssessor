/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.dao;

import admin.pojo.Admin;
import teacher.dbutil.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import static oracle.net.aso.C11.n;

/**
 *
 * @author Admin
 */
public class admindao {

    public static boolean validate(String user, String pass) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select password,name from admin where name=?");
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

    public static Admin getAdminDetails(String user) throws SQLException {
        Admin a = new Admin();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from admin where name=?");
        ps.setString(1, user);
        ResultSet rs = ps.executeQuery();
        rs.next();
        a.setName(rs.getString(1));
        a.setPwd(rs.getString(2));
        return a;
    }

    public static void setpassword(String n, String name) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update admin set password=? where name=?");
        ps.setString(1, n);
        ps.setString(2, name);
        ps.executeQuery();//To change body of generated methods, choose Tools | Templates.
    } //To change body of generated methods, choose Tools | Templates.

    public static void register(String teacher_id, String fname, String lname, String email, String mob, String dob, String gen, String pass, String branch) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into teacher values(?,?,?,?,?,?,?,?)");
        ps.setString(1, fname + "" + lname);
        ps.setString(2, teacher_id);
        ps.setString(3, branch);
        ps.setString(4, email);
        ps.setString(5, mob);
        ps.setString(6, gen);
        ps.setString(7, dob);
        ps.setString(8, pass);
        ps.executeQuery(); //To change body of generated methods, choose Tools | Templates.
    }

    public static void removeteacher(String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from teacher where teacher_id=?");
        ps.setString(1, tid);
        ps.executeQuery(); //To change body of generated methods, choose Tools | Templates.
    }

    public static String searchteacher(String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select name from teacher where teacher_id=?");
        ps.setString(1, tid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getString(1);//To change body of generated methods, choose Tools | Templates.
    }

    public static String searchstudent(String sid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select name from student where roll_no=?");
        ps.setString(1, sid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getString(1);//To change body of generated methods, choose Tools | Templates.
    }

    public static void removestudent(String sid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from submitted where roll_no=?");
        ps.setString(1, sid);
        PreparedStatement ts = conn.prepareStatement("delete from student where roll_no=?");
        ts.setString(1, sid);
        ps.executeQuery();
        ts.executeQuery();//To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<String> getBranch() throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from branch");
        ResultSet rs = ps.executeQuery();
        ArrayList<String> al = new ArrayList();
        while (rs.next()) {
            al.add(rs.getString(1));
        }
        return al; //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<String> getTeacherSubjects(String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select subject_name from teacher_subject where teacher_id=?");
        ps.setString(1, tid);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> al = new ArrayList();
        while (rs.next()) {
            al.add(rs.getString(1));
        }
        return al; //To change body of generated methods, choose Tools | Templates.
    }

    public static void removesub(String subject, String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from teacher_subject where subject_name=? and teacher_id=?");
        ps.setString(1, subject);
        ps.setString(2, tid);
        ps.executeQuery();
//To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<String> getEmptySubjects() throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT t1.subject_name\n"
                + "FROM subject t1\n"
                + "LEFT JOIN teacher_subject t2 ON t2.subject_name = t1.subject_name\n"
                + "WHERE t2.subject_name IS NULL");

        ResultSet rs = ps.executeQuery();
        ArrayList<String> al = new ArrayList();
        while (rs.next()) {
            al.add(rs.getString(1));
        }
        return al;  //To change body of generated methods, choose Tools | Templates.
    }

    public static void addsub(String sub_name, String tid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into teacher_subject values(?,?,(select subject_id from subject where subject_name=?))");
        ps.setString(1,tid);
        ps.setString(2, sub_name);
        ps.setString(3,sub_name);

        ResultSet rs = ps.executeQuery();
         //To change body of generated methods, choose Tools | Templates.
    }
}
