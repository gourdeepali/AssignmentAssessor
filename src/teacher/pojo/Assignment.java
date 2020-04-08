/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher.pojo;

/**
 *
 * @author aman
 */
public class Assignment {

    private String assignment_id;
    private String subject_id;

    private String title;
    private String question;

    public void setAssignment_id(String assignment_id) {
        this.assignment_id = assignment_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAssignment_id() {
        return assignment_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion() {
        return question;
    }

}
