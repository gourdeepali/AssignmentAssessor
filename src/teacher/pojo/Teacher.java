/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.pojo;

/**
 *
 * @author Admin
 */
public class Teacher {
   
    private static String teacher_id;
    private static String name;
    private static String gender;
    private static String email;
    private static String mob;
    private static String branch;
    private static String pwd;
    private static String dob;

    public static void setDob(String dob) {
        Teacher.dob = dob;
    }

    public static String getDob() {
        return dob;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getMob() {
        return mob;
    }

    public String getBranch() {
        return branch;
    }

    public String getPwd() {
        return pwd;
    }
    
}
