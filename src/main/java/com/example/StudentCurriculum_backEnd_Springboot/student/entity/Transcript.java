package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Transcript implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "No", type = IdType.AUTO)
    private Integer no;

    private String teacherId;

    private String studentId;

    private Integer transcriptSocre;

    private LocalDateTime transcriptTime;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getTranscriptSocre() {
        return transcriptSocre;
    }

    public void setTranscriptSocre(Integer transcriptSocre) {
        this.transcriptSocre = transcriptSocre;
    }

    public LocalDateTime getTranscriptTime() {
        return transcriptTime;
    }

    public void setTranscriptTime(LocalDateTime transcriptTime) {
        this.transcriptTime = transcriptTime;
    }

    @Override
    public String toString() {
        return "Transcript{" +
            "no = " + no +
            ", teacherId = " + teacherId +
            ", studentId = " + studentId +
            ", transcriptSocre = " + transcriptSocre +
            ", transcriptTime = " + transcriptTime +
        "}";
    }
}
