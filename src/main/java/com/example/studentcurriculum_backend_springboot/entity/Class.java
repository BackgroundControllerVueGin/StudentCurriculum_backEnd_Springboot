package com.example.StudentCurriculum_backEnd_Springboot.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer classId;

    private String className;

    private Integer classYear;

    private String classMajor;

    private Integer coursetableId;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassYear() {
        return classYear;
    }

    public void setClassYear(Integer classYear) {
        this.classYear = classYear;
    }

    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor;
    }

    public Integer getCoursetableId() {
        return coursetableId;
    }

    public void setCoursetableId(Integer coursetableId) {
        this.coursetableId = coursetableId;
    }

    @Override
    public String toString() {
        return "Class{" +
            "classId = " + classId +
            ", className = " + className +
            ", classYear = " + classYear +
            ", classMajor = " + classMajor +
            ", coursetableId = " + coursetableId +
        "}";
    }
}
