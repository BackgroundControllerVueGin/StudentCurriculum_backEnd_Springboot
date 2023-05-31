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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private String teacherJobId;

    private String teacherName;

    private String teacherSex;

    private Integer courseId;

    public String getTeacherJobId() {
        return teacherJobId;
    }

    public void setTeacherJobId(String teacherJobId) {
        this.teacherJobId = teacherJobId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "teacherJobId = " + teacherJobId +
            ", teacherName = " + teacherName +
            ", teacherSex = " + teacherSex +
            ", courseId = " + courseId +
        "}";
    }
}
