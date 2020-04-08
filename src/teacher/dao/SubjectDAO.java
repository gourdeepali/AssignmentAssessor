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
import teacher.dbutil.DBConnection;
import teacher.pojo.Subject;

/**
 *
 * @author aman
 */
public class SubjectDAO {
      public static Subject getSubjectDetails(String subname) throws SQLException
    {
        Subject s=new Subject();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from subject where subject_name=?");
        ps.setString(1,subname);
        ResultSet rs=ps.executeQuery();
        rs.next();
        s.setSubject_id(rs.getString(1)); 
        s.setSubject_name(subname);
        s.setSem(rs.getInt(3));
        s.setBranch(rs.getString(4));
        return s;
        }
}
