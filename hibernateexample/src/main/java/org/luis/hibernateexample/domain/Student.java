package org.luis.hibernateexample.domain;

import java.io.Serializable;

public class Student implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer studentId;
    private String studentName;
    private String studentAge;
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

}
