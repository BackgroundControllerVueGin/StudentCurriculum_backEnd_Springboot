package com.example.StudentCurriculum_backEnd_Springboot.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Transcript implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "transcript_id", type = IdType.AUTO)
    private Integer transcriptId;

    private String transcriptTreacherJobId;

    private String transcriptStudentJobId;

    private Integer transcriptSocre;

    private LocalDate transcriptDate;

    public Integer getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Integer transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getTranscriptTreacherJobId() {
        return transcriptTreacherJobId;
    }

    public void setTranscriptTreacherJobId(String transcriptTreacherJobId) {
        this.transcriptTreacherJobId = transcriptTreacherJobId;
    }

    public String getTranscriptStudentJobId() {
        return transcriptStudentJobId;
    }

    public void setTranscriptStudentJobId(String transcriptStudentJobId) {
        this.transcriptStudentJobId = transcriptStudentJobId;
    }

    public Integer getTranscriptSocre() {
        return transcriptSocre;
    }

    public void setTranscriptSocre(Integer transcriptSocre) {
        this.transcriptSocre = transcriptSocre;
    }

    public LocalDate getTranscriptDate() {
        return transcriptDate;
    }

    public void setTranscriptDate(LocalDate transcriptDate) {
        this.transcriptDate = transcriptDate;
    }

    @Override
    public String toString() {
        return "Transcript{" +
            "transcriptId = " + transcriptId +
            ", transcriptTreacherJobId = " + transcriptTreacherJobId +
            ", transcriptStudentJobId = " + transcriptStudentJobId +
            ", transcriptSocre = " + transcriptSocre +
            ", transcriptDate = " + transcriptDate +
        "}";
    }
}
