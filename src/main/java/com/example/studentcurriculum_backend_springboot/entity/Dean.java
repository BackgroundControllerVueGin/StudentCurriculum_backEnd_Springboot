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
public class Dean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer deanId;

    private String deanName;

    public Integer getDeanId() {
        return deanId;
    }

    public void setDeanId(Integer deanId) {
        this.deanId = deanId;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    @Override
    public String toString() {
        return "Dean{" +
            "deanId = " + deanId +
            ", deanName = " + deanName +
        "}";
    }
}
