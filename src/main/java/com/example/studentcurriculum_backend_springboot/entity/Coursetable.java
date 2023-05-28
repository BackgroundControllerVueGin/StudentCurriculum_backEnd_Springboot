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
public class Coursetable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer coursetableId;

    private String coursetableStartTime;

    private String coursetableClassId;

    private String coursetableSchoolYear;

    private String coursetableMajor;

    private Integer deanId;

    public Integer getCoursetableId() {
        return coursetableId;
    }

    public void setCoursetableId(Integer coursetableId) {
        this.coursetableId = coursetableId;
    }

    public String getCoursetableStartTime() {
        return coursetableStartTime;
    }

    public void setCoursetableStartTime(String coursetableStartTime) {
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

    public Integer getDeanId() {
        return deanId;
    }

    public void setDeanId(Integer deanId) {
        this.deanId = deanId;
    }

    @Override
    public String toString() {
        return "Coursetable{" +
            "coursetableId = " + coursetableId +
            ", coursetableStartTime = " + coursetableStartTime +
            ", coursetableClassId = " + coursetableClassId +
            ", coursetableSchoolYear = " + coursetableSchoolYear +
            ", coursetableMajor = " + coursetableMajor +
            ", deanId = " + deanId +
        "}";
    }
}
