package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public class Dean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deanJobId;

    private String deanName;

    public String getDeanJobId() {
        return deanJobId;
    }

    public void setDeanJobId(String deanJobId) {
        this.deanJobId = deanJobId;
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
            "deanJobId = " + deanJobId +
            ", deanName = " + deanName +
        "}";
    }
}
