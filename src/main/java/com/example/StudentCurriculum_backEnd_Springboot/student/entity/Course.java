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
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer courseId;

    private String courseName;

    private String courseCreditshours;

    private String courseCredit;

    private String courseDeanJobId;

    private LocalDate courseStartDate;

    private LocalDate courseEndDate;

    private String courseTeacherJobId;

    private String courseClassId;

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

    public String getCourseDeanJobId() {
        return courseDeanJobId;
    }

    public void setCourseDeanJobId(String courseDeanJobId) {
        this.courseDeanJobId = courseDeanJobId;
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

    public String getCourseTeacherJobId() {
        return courseTeacherJobId;
    }

    public void setCourseTeacherJobId(String courseTeacherJobId) {
        this.courseTeacherJobId = courseTeacherJobId;
    }

    public String getCourseClassId() {
        return courseClassId;
    }

    public void setCourseClassId(String courseClassId) {
        this.courseClassId = courseClassId;
    }

    @Override
    public String toString() {
        return "Course{" +
            "courseId = " + courseId +
            ", courseName = " + courseName +
            ", courseCreditshours = " + courseCreditshours +
            ", courseCredit = " + courseCredit +
            ", courseDeanJobId = " + courseDeanJobId +
            ", courseStartDate = " + courseStartDate +
            ", courseEndDate = " + courseEndDate +
            ", courseTeacherJobId = " + courseTeacherJobId +
            ", courseClassId = " + courseClassId +
        "}";
    }
}
