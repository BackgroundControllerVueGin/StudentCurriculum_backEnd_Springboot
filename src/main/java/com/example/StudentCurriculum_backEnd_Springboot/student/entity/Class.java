package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    private String classId;

    private String className;

    private String classYear;

    private String classMajor;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor;
    }

    @Override
    public String toString() {
        return "Class{" +
            "classId = " + classId +
            ", className = " + className +
            ", classYear = " + classYear +
            ", classMajor = " + classMajor +
        "}";
    }
}
