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
public class Subject {
    private int sem;
    private String subject_name;
    private String subject_id;
    private String branch;

    public void setSem(int sem) {
        this.sem = sem;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSem() {
        return sem;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public String getBranch() {
        return branch;
    }
    
    
    
}
