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
import teacher.dbutil.DBConnection;
import student.pojo.Subject;

/**
 *
 * @author aman
 */
public class SubjectDAO {

    public static ArrayList<String> getSubjects(int sem) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select subject_name from subject where sem=?");
        ps.setInt(1, sem);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> al = new ArrayList();
        while (rs.next()) {
            al.add(rs.getString(1));
        }
        return al;
    }

    public static Subject getSubjectDetails(String subname) throws SQLException {
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from subject where subject_name=?");
        ps.setString(1, subname);
        ResultSet rs = ps.executeQuery();
        Subject s = new Subject();
        if (rs.next()) {
            s.setSubject_id(rs.getString(1));
            s.setSubject_name(subname);
            s.setSem(rs.getInt(3));
            s.setBranch(rs.getString(4));
        }
        return s;
    }

}
