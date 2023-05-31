package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer attendanceId;

    private LocalDateTime attendanceTime;

    private String attendanceStudentJobId;

    private Integer attendanceCourserecordId;

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

    public String getAttendanceStudentJobId() {
        return attendanceStudentJobId;
    }

    public void setAttendanceStudentJobId(String attendanceStudentJobId) {
        this.attendanceStudentJobId = attendanceStudentJobId;
    }

    public Integer getAttendanceCourserecordId() {
        return attendanceCourserecordId;
    }

    public void setAttendanceCourserecordId(Integer attendanceCourserecordId) {
        this.attendanceCourserecordId = attendanceCourserecordId;
    }

    @Override
    public String toString() {
        return "Attendance{" +
            "attendanceId = " + attendanceId +
            ", attendanceTime = " + attendanceTime +
            ", attendanceStudentJobId = " + attendanceStudentJobId +
            ", attendanceCourserecordId = " + attendanceCourserecordId +
        "}";
    }
}
