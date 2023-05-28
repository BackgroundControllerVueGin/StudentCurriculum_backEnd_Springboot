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
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer teacherId;

    private String teacherName;

    private String teacherSex;

    private Integer courseId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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
            "teacherId = " + teacherId +
            ", teacherName = " + teacherName +
            ", teacherSex = " + teacherSex +
            ", courseId = " + courseId +
        "}";
    }
}
