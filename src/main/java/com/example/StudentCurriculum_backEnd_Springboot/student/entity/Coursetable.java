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
public class Coursetable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer coursetableId;

    private LocalDate coursetableStartTime;

    private String coursetableClassId;

    private String coursetableSchoolYear;

    private String coursetableMajor;

    private String cousrsetableDeanJobId;

    public Integer getCoursetableId() {
        return coursetableId;
    }

    public void setCoursetableId(Integer coursetableId) {
        this.coursetableId = coursetableId;
    }

    public LocalDate getCoursetableStartTime() {
        return coursetableStartTime;
    }

    public void setCoursetableStartTime(LocalDate coursetableStartTime) {
        this.coursetableStartTime = coursetableStartTime;
    }

    public String getCoursetableClassId() {
        return coursetableClassId;
    }

    public void setCoursetableClassId(String coursetableClassId) {
        this.coursetableClassId = coursetableClassId;
    }

    public String getCoursetableSchoolYear() {
        return coursetableSchoolYear;
    }

    public void setCoursetableSchoolYear(String coursetableSchoolYear) {
        this.coursetableSchoolYear = coursetableSchoolYear;
    }

    public String getCoursetableMajor() {
        return coursetableMajor;
    }

    public void setCoursetableMajor(String coursetableMajor) {
        this.coursetableMajor = coursetableMajor;
    }

    public String getCousrsetableDeanJobId() {
        return cousrsetableDeanJobId;
    }

    public void setCousrsetableDeanJobId(String cousrsetableDeanJobId) {
        this.cousrsetableDeanJobId = cousrsetableDeanJobId;
    }

    @Override
    public String toString() {
        return "Coursetable{" +
            "coursetableId = " + coursetableId +
            ", coursetableStartTime = " + coursetableStartTime +
            ", coursetableClassId = " + coursetableClassId +
            ", coursetableSchoolYear = " + coursetableSchoolYear +
            ", coursetableMajor = " + coursetableMajor +
            ", cousrsetableDeanJobId = " + cousrsetableDeanJobId +
        "}";
    }
}
