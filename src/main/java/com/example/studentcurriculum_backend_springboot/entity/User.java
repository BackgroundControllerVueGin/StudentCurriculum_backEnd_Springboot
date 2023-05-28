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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer jobId;

    private Integer userPassword;

    private LocalDateTime userCreateOfTime;

    private Integer userNumber;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Integer userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getUserCreateOfTime() {
        return userCreateOfTime;
    }

    public void setUserCreateOfTime(LocalDateTime userCreateOfTime) {
        this.userCreateOfTime = userCreateOfTime;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", jobId = " + jobId +
            ", userPassword = " + userPassword +
            ", userCreateOfTime = " + userCreateOfTime +
            ", userNumber = " + userNumber +
        "}";
    }
}
