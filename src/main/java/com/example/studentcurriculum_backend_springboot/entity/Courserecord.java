package com.example.StudentCurriculum_backEnd_Springboot.entity;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
public class Courserecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer courserecordId;

    private Integer coursetableId;

    private Integer courserecordNumberOfWeek;

    private Boolean courserecordDayOfWeek;

    private LocalTime courserecordStartTime;

    private Integer courseId;

    private String courserecordAddress;

    private Integer courserecordCourseId;

    public Integer getCourserecordId() {
        return courserecordId;
    }

    public void setCourserecordId(Integer courserecordId) {
        this.courserecordId = courserecordId;
    }

    public Integer getCoursetableId() {
        return coursetableId;
    }

    public void setCoursetableId(Integer coursetableId) {
        this.coursetableId = coursetableId;
    }

    public Integer getCourserecordNumberOfWeek() {
        return courserecordNumberOfWeek;
    }

    public void setCourserecordNumberOfWeek(Integer courserecordNumberOfWeek) {
        this.courserecordNumberOfWeek = courserecordNumberOfWeek;
    }

    public Boolean getCourserecordDayOfWeek() {
        return courserecordDayOfWeek;
    }

    public void setCourserecordDayOfWeek(Boolean courserecordDayOfWeek) {
        this.courserecordDayOfWeek = courserecordDayOfWeek;
    }

    public LocalTime getCourserecordStartTime() {
        return courserecordStartTime;
    }

    public void setCourserecordStartTime(LocalTime courserecordStartTime) {
        this.courserecordStartTime = courserecordStartTime;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourserecordAddress() {
        return courserecordAddress;
    }

    public void setCourserecordAddress(String courserecordAddress) {
        this.courserecordAddress = courserecordAddress;
    }

    public Integer getCourserecordCourseId() {
        return courserecordCourseId;
    }

    public void setCourserecordCourseId(Integer courserecordCourseId) {
        this.courserecordCourseId = courserecordCourseId;
    }

    @Override
    public String toString() {
        return "Courserecord{" +
            "courserecordId = " + courserecordId +
            ", coursetableId = " + coursetableId +
            ", courserecordNumberOfWeek = " + courserecordNumberOfWeek +
            ", courserecordDayOfWeek = " + courserecordDayOfWeek +
            ", courserecordStartTime = " + courserecordStartTime +
            ", courseId = " + courseId +
            ", courserecordAddress = " + courserecordAddress +
            ", courserecordCourseId = " + courserecordCourseId +
        "}";
    }
}
