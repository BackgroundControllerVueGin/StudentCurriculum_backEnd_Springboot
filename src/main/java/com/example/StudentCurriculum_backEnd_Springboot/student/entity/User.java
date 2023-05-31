package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author blackhaird
 * @since 2023-05-30
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    private String userJobId;

    private String userPassword;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date userCreateOfTime;

    private Integer userRoleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserJobId() {
        return userJobId;
    }

    public void setUserJobId(String userJobId) {
        this.userJobId = userJobId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserCreateOfTime() {
        return userCreateOfTime;
    }

    public void setUserCreateOfTime(Date userCreateOfTime) {
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
            ", userJobId = " + userJobId +
            ", userPassword = " + userPassword +
            ", userCreateOfTime = " + userCreateOfTime +
            ", userRoleId = " + userRoleId +
        "}";
    }
}
