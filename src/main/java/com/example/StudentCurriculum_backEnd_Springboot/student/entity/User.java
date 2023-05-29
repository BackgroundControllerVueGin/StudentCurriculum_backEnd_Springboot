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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String jobId;

    private String userPassword;

    private LocalDateTime userCreateOfTime;

    private Integer userRoleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getUserCreateOfTime() {
        return userCreateOfTime;
    }

    public void setUserCreateOfTime(LocalDateTime userCreateOfTime) {
        this.userCreateOfTime = userCreateOfTime;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId = " + userId +
            ", jobId = " + jobId +
            ", userPassword = " + userPassword +
            ", userCreateOfTime = " + userCreateOfTime +
            ", userRoleId = " + userRoleId +
        "}";
    }
}
