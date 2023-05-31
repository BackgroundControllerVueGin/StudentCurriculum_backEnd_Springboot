package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public class Courserecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer courserecordId;

    private Integer courserecordTableId;

    private Integer courserecordNumberOfWeek;

    private Boolean courserecordDayOfWeek;

    private LocalTime courserecordStartTime;

    private Integer courserecordCourseId;

    private String courserecordAddress;

    public Integer getCourserecordId() {
        return courserecordId;
    }

    public void setCourserecordId(Integer courserecordId) {
        this.courserecordId = courserecordId;
    }

    public Integer getCourserecordTableId() {
        return courserecordTableId;
    }

    public void setCourserecordTableId(Integer courserecordTableId) {
        this.courserecordTableId = courserecordTableId;
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

    public Integer getCourserecordCourseId() {
        return courserecordCourseId;
    }

    public void setCourserecordCourseId(Integer courserecordCourseId) {
        this.courserecordCourseId = courserecordCourseId;
    }

    public String getCourserecordAddress() {
        return courserecordAddress;
    }

    public void setCourserecordAddress(String courserecordAddress) {
        this.courserecordAddress = courserecordAddress;
    }

    @Override
    public String toString() {
        return "Courserecord{" +
            "courserecordId = " + courserecordId +
            ", courserecordTableId = " + courserecordTableId +
            ", courserecordNumberOfWeek = " + courserecordNumberOfWeek +
            ", courserecordDayOfWeek = " + courserecordDayOfWeek +
            ", courserecordStartTime = " + courserecordStartTime +
            ", courserecordCourseId = " + courserecordCourseId +
            ", courserecordAddress = " + courserecordAddress +
        "}";
    }
}
