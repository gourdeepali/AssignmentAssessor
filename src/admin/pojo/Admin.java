/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.pojo;

/**
 *
 * @author aman
 */
public class Admin {
    private static String name;
    private static String pwd;

    public static void setName(String name) {
        Admin.name = name;
    }

    public static void setPwd(String pwd) {
        Admin.pwd = pwd;
    }

    public static String getName() {
        return name;
    }

    public static String getPwd() {
        return pwd;
    }
}
