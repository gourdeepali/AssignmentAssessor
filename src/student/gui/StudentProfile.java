package student.gui;

import teacher.gui.*;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import student.dao.StudentDAO;
import static student.gui.StudentLogin.st;
import student.pojo.Student;
import teacher.dao.TeacherDAO;
import teacher.pojo.Teacher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arpit
 */
public class StudentProfile extends javax.swing.JFrame {

    
    static String previ;

    /**
     * Creates new form TeacherProfile
     */
    public StudentProfile(String prev) {
        initComponents();
        previ = prev;
        super.setLocationRelativeTo(null);

        namelabel.setText(st.getFirstname() + " " + st.getLastname());
        enrolllabel.setText(st.getRoll_no());
        enrolllabel1.setText(st.getRoll_no());
        studentnamelabel.setText(st.getFirstname() + " " + st.getLastname());
        emaillabel.setText(st.getEmail());
        genderLabel.setText(st.getGender());
        dateLabel.setText(st.getDob());
        mobnolabel.setText(st.getMob() + "");
        branchlabel.setText(st.getBranch());
        semlabel.setText(st.getSem() + "");
    }

    private StudentProfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        teacherPicLabel = new javax.swing.JPanel();
        studentnamelabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enrolllabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        branchlabel = new javax.swing.JTextField();
        enrolllabel = new javax.swing.JTextField();
        genderLabel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        changeLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JPasswordField();
        newPasswordLabel = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JPasswordField();
        saveLabel = new javax.swing.JButton();
        backLabel = new javax.swing.JButton();
        dateLabel = new javax.swing.JTextField();
        mobnolabel = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emaillabel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        namelabel = new javax.swing.JTextField();
        semlabel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1100, 700));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(289, 372));
        jPanel2.setMinimumSize(new java.awt.Dimension(289, 372));

        javax.swing.GroupLayout teacherPicLabelLayout = new javax.swing.GroupLayout(teacherPicLabel);
        teacherPicLabel.setLayout(teacherPicLabelLayout);
        teacherPicLabelLayout.setHorizontalGroup(
            teacherPicLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        teacherPicLabelLayout.setVerticalGroup(
            teacherPicLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        studentnamelabel.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        studentnamelabel.setForeground(new java.awt.Color(255, 255, 255));
        studentnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentnamelabel.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enrollment no.");

        enrolllabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        enrolllabel1.setForeground(new java.awt.Color(255, 255, 255));
        enrolllabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enrolllabel1.setText("00000000000000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(teacherPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentnamelabel)
                    .addComponent(jLabel4)
                    .addComponent(enrolllabel1))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(teacherPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(studentnamelabel)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enrolllabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Enrollment no.");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("New Password");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Confirm Password");

        branchlabel.setEditable(false);
        branchlabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        branchlabel.setForeground(new java.awt.Color(51, 51, 51));
        branchlabel.setText("Teacher Name");
        branchlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchlabelActionPerformed(evt);
            }
        });

        enrolllabel.setEditable(false);
        enrolllabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        enrolllabel.setForeground(new java.awt.Color(51, 51, 51));
        enrolllabel.setText("000000000000");
        enrolllabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrolllabelActionPerformed(evt);
            }
        });

        genderLabel.setEditable(false);
        genderLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(51, 51, 51));
        genderLabel.setText("M/F");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Gender");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Date of Birth");

        changeLabel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        changeLabel.setText("Tap to Change");
        changeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeLabelMouseClicked(evt);
            }
        });

        passwordLabel.setEditable(false);
        passwordLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("jPasswordField1");

        newPasswordLabel.setEditable(false);
        newPasswordLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(51, 51, 51));
        newPasswordLabel.setText("jPasswordField2");

        confirmPasswordLabel.setEditable(false);
        confirmPasswordLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(51, 51, 51));
        confirmPasswordLabel.setText("jPasswordField3");

        saveLabel.setBackground(new java.awt.Color(255, 255, 255));
        saveLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(51, 51, 51));
        saveLabel.setText("Save Details");
        saveLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveLabel.setEnabled(false);
        saveLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveLabelActionPerformed(evt);
            }
        });

        backLabel.setBackground(new java.awt.Color(255, 255, 255));
        backLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backLabel.setForeground(new java.awt.Color(51, 51, 51));
        backLabel.setText("Back");
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLabelActionPerformed(evt);
            }
        });

        dateLabel.setEditable(false);
        dateLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(51, 51, 51));
        dateLabel.setText("DD/MM/YYYY");
        dateLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateLabelActionPerformed(evt);
            }
        });

        mobnolabel.setEditable(false);
        mobnolabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mobnolabel.setForeground(new java.awt.Color(51, 51, 51));
        mobnolabel.setText("Teacher Name");
        mobnolabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnolabelActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Mobile o.");

        emaillabel.setEditable(false);
        emaillabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        emaillabel.setForeground(new java.awt.Color(51, 51, 51));
        emaillabel.setText("Teacher Name");
        emaillabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaillabelActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("email");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("sem");

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("branch");

        namelabel.setEditable(false);
        namelabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(51, 51, 51));
        namelabel.setText("Teacher Name");
        namelabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namelabelActionPerformed(evt);
            }
        });

        semlabel.setEditable(false);
        semlabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        semlabel.setForeground(new java.awt.Color(51, 51, 51));
        semlabel.setText("Teacher Name");
        semlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semlabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enrolllabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(134, 134, 134)
                                .addComponent(mobnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(backLabel)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel8)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(branchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(108, 108, 108)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(58, 58, 58)
                                                .addComponent(changeLabel))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(semlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(saveLabel))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11))
                                        .addGap(147, 147, 147)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(134, 134, 134)
                                        .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 158, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enrolllabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeLabel))
                        .addGap(6, 6, 6)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(mobnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(branchlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(semlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backLabel)
                    .addComponent(saveLabel))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeLabelMouseClicked
        passwordLabel.setEditable(true);
        newPasswordLabel.setEditable(true);
        confirmPasswordLabel.setEditable(true);
        saveLabel.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_changeLabelMouseClicked

    private void dateLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateLabelActionPerformed

    private void enrolllabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrolllabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enrolllabelActionPerformed

    private void branchlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchlabelActionPerformed

    private void backLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLabelActionPerformed
        if (previ.equals("Sframe")) {
            try {
                new StudentFrame(st.getRoll_no()).setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                new StudentSubjectFrame().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_backLabelActionPerformed

    private void saveLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveLabelActionPerformed
        if (String.valueOf(passwordLabel.getPassword()).equals(st.getPwd())) {
            String n = String.valueOf(newPasswordLabel.getPassword());

            if (n.equals(String.valueOf(confirmPasswordLabel.getPassword()))) {
                try {
                    StudentDAO.setpassword(n, st.getRoll_no());
                    System.out.println("password changed");
                } catch (SQLException ex) {
                    Logger.getLogger(StudentProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("pass not matched");
            }

        } else {
            System.out.println("prev pass wrong");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveLabelActionPerformed

    private void mobnolabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnolabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnolabelActionPerformed

    private void emaillabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaillabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emaillabelActionPerformed

    private void namelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namelabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namelabelActionPerformed

    private void semlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semlabelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backLabel;
    private javax.swing.JTextField branchlabel;
    private javax.swing.JLabel changeLabel;
    private javax.swing.JPasswordField confirmPasswordLabel;
    private javax.swing.JTextField dateLabel;
    private javax.swing.JTextField emaillabel;
    private javax.swing.JTextField enrolllabel;
    private javax.swing.JLabel enrolllabel1;
    private javax.swing.JTextField genderLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobnolabel;
    private javax.swing.JTextField namelabel;
    private javax.swing.JPasswordField newPasswordLabel;
    private javax.swing.JPasswordField passwordLabel;
    private javax.swing.JButton saveLabel;
    private javax.swing.JTextField semlabel;
    private javax.swing.JLabel studentnamelabel;
    private javax.swing.JPanel teacherPicLabel;
    // End of variables declaration//GEN-END:variables
}
