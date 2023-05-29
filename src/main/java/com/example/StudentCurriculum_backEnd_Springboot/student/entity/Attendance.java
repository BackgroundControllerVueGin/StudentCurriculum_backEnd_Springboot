package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

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

    private String studentId;

    private String courserecordId;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourserecordId() {
        return courserecordId;
    }

    public void setCourserecordId(String courserecordId) {
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
