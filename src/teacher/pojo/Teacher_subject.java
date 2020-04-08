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
public class Teacher_subject {
    private static String teacher_id;
    private static String subject_name;
    private static String subject_id;
    

    public static void setTeacher_id(String teacher_id) {
        Teacher_subject.teacher_id = teacher_id;
    }

    public static void setSubject_name(String subject_name) {
        Teacher_subject.subject_name = subject_name;
    }

    public static void setSubject_id(String subject_id) {
        Teacher_subject.subject_id = subject_id;
    }

    

    public static String getTeacher_id() {
        return teacher_id;
    }

    public static String getSubject_name() {
        return subject_name;
    }

    public static String getSubject_id() {
        return subject_id;
    }

   
    
}
 