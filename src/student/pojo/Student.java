/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.pojo;

/**
 *
 * @author aman
 */
public class Student {
private String roll_no;
    private static String firstname;
    private static String lastname;
    private static String branch;
    private static int sem;
    private static String email;
    private static String mob;
    private static String Gender;
    private static String pwd;
    private static String dob;

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public static String getFirstname() {
        return firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public static String getBranch() {
        return branch;
    }

    public static int getSem() {
        return sem;
    }

    public static String getEmail() {
        return email;
    }

    public static String getMob() {
        return mob;
    }

    public static String getGender() {
        return Gender;
    }

    public static String getPwd() {
        return pwd;
    }

    public static String getDob() {
        return dob;
    }

    public static void setFirstname(String firstname) {
        Student.firstname = firstname;
    }

    public static void setLastname(String lastname) {
        Student.lastname = lastname;
    }

    public static void setBranch(String branch) {
        Student.branch = branch;
    }

    public static void setSem(int sem) {
        Student.sem = sem;
    }

    public static void setEmail(String email) {
        Student.email = email;
    }

    public static void setMob(String mob) {
        Student.mob = mob;
    }

    public static void setGender(String Gender) {
        Student.Gender = Gender;
    }

    public static void setPwd(String pwd) {
        Student.pwd = pwd;
    }

    public static void setDob(String dob) {
        Student.dob = dob;
    }

}
