package com.example.StudentCurriculum_backEnd_Springboot.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer studentId;

    private String studentName;

    private String studentSex;

    private LocalDate studentEnterYear;

    private String studentMajor;

    private String studentClass;

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

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public LocalDate getStudentEnterYear() {
        return studentEnterYear;
    }

    public void setStudentEnterYear(LocalDate studentEnterYear) {
        this.studentEnterYear = studentEnterYear;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
            "studentId = " + studentId +
            ", studentName = " + studentName +
            ", studentSex = " + studentSex +
            ", studentEnterYear = " + studentEnterYear +
            ", studentMajor = " + studentMajor +
            ", studentClass = " + studentClass +
        "}";
    }
}
