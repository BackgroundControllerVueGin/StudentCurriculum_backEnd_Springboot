package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studentJobId;

    private String studentName;

    private String studentSex;

    private LocalDate studentEnterYear;

    private String studentMajor;

    private String studentClassId;

    public String getStudentJobId() {
        return studentJobId;
    }

    public void setStudentJobId(String studentJobId) {
        this.studentJobId = studentJobId;
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

    public String getStudentClassId() {
        return studentClassId;
    }

    public void setStudentClassId(String studentClassId) {
        this.studentClassId = studentClassId;
    }

    @Override
    public String toString() {
        return "Student{" +
            "studentJobId = " + studentJobId +
            ", studentName = " + studentName +
            ", studentSex = " + studentSex +
            ", studentEnterYear = " + studentEnterYear +
            ", studentMajor = " + studentMajor +
            ", studentClassId = " + studentClassId +
        "}";
    }
}
