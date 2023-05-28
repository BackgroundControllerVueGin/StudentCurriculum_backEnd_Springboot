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
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer courseId;

    private String courseName;

    private String courseCreditshours;

    private String courseCredit;

    private Integer deanId;

    private LocalDate courseStartDate;

    private LocalDate courseEndDate;

    private Integer teacherId;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCreditshours() {
        return courseCreditshours;
    }

    public void setCourseCreditshours(String courseCreditshours) {
        this.courseCreditshours = courseCreditshours;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public Integer getDeanId() {
        return deanId;
    }

    public void setDeanId(Integer deanId) {
        this.deanId = deanId;
    }

    public LocalDate getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(LocalDate courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public LocalDate getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(LocalDate courseEndDate) {
        this.courseEndDate = courseEndDate;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Course{" +
            "courseId = " + courseId +
            ", courseName = " + courseName +
            ", courseCreditshours = " + courseCreditshours +
            ", courseCredit = " + courseCredit +
            ", deanId = " + deanId +
            ", courseStartDate = " + courseStartDate +
            ", courseEndDate = " + courseEndDate +
            ", teacherId = " + teacherId +
        "}";
    }
}
