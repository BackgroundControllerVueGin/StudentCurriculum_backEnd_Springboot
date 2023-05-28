package com.example.StudentCurriculum_backEnd_Springboot.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-29
 */
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer attendanceId;

    private LocalDateTime attendanceTime;

    private Integer studentId;

    private Integer courserecordId;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public LocalDateTime getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(LocalDateTime attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourserecordId() {
        return courserecordId;
    }

    public void setCourserecordId(Integer courserecordId) {
        this.courserecordId = courserecordId;
    }

    @Override
    public String toString() {
        return "Attendance{" +
            "attendanceId = " + attendanceId +
            ", attendanceTime = " + attendanceTime +
            ", studentId = " + studentId +
            ", courserecordId = " + courserecordId +
        "}";
    }
}
