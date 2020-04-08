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
import java.util.ArrayList;
import java.util.Arrays;
import student.pojo.Student;
import teacher.dbutil.DBConnection;
import teacher.pojo.Teacher;

/**
 *
 * @author aman
 */
public class StudentDAO {

    public static boolean validate(String userid, String pass) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select password from student where roll_no=?");
        ps.setString(1, userid);
        ResultSet rs = ps.executeQuery();
        boolean r = false;
        rs.next();
        if (rs.getString(1).equals(pass)) {
            r = true;
        }
        return r; //To change body of generated methods, choose Tools | Templates.
    }

    public static Student getStudentDetails(String userid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from student where roll_no=?");
        Student s = new Student();
        ps.setString(1, userid);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            s.setRoll_no(userid);
            s.setFirstname(rs.getString(1));
            s.setBranch(rs.getString(3));
            s.setSem(rs.getInt(4));
            s.setEmail(rs.getString(5));
            s.setMob(rs.getString(6));
            s.setGender(rs.getString(7));
            s.setLastname(rs.getString(8));
            s.setDob(rs.getString(9));
            s.setPwd(rs.getString(10));
        }
        return s;

    }

    public static void register(String enroll, String fname, String lname, String email, String mob, String dob, String gen, String branch, int sem, String pass) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");

        ps.setString(1, fname);
        ps.setString(2, enroll);
        ps.setString(3, branch);
        ps.setInt(4, sem);
        ps.setString(5, email);
        ps.setString(6, mob);
        ps.setString(7, gen);
        ps.setString(8, lname);
        ps.setString(9, dob);
        ps.setString(10, pass);
        ps.executeQuery();
        //To change body of generated methods, choose Tools | Templates.
    }
    public static void setpassword(String n,String sid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update student set password=? where roll_no=?");
        ps.setString(1, n);
        ps.setString(2, sid);
        ps.executeQuery();//To change body of generated methods, choose Tools | Templates.
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

}
