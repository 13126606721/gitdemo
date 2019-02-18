package com.baizhi.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentId;
    private String studentName;
    private String studentAge;
    private String studentSex;
    private String studentClazz;
    private String studentPassword;
    private String studentImage;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
        System.out.println("SFSADFA");
        System.out.println("SFSADFA");
        System.out.println("SFSADFA");
        System.out.println("SFSADFA");
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public void setStudentClazz(String studentClazz) {
        this.studentClazz = studentClazz;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public void setStudentImage(String studentImage) {
        this.studentImage = studentImage;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public String getStudentClazz() {
        return studentClazz;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public String getStudentImage() {
        return studentImage;
    }
}
