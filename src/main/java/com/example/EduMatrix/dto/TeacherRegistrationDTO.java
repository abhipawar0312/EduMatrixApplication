package com.example.EduMatrix.dto;

import lombok.Data;


public class TeacherRegistrationDTO extends BaseUserRegistrationDTO {
    private String subject;
    private String educationBoard;
    private String experience;
    private String qualification;
    private String specialization;
    private String teachingStyle;
    private String availability;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEducationBoard() {
        return educationBoard;
    }

    public void setEducationBoard(String educationBoard) {
        this.educationBoard = educationBoard;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTeachingStyle() {
        return teachingStyle;
    }

    public void setTeachingStyle(String teachingStyle) {
        this.teachingStyle = teachingStyle;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public TeacherRegistrationDTO(String subject, String educationBoard, String experience, String qualification, String specialization, String teachingStyle, String availability) {
        this.subject = subject;
        this.educationBoard = educationBoard;
        this.experience = experience;
        this.qualification = qualification;
        this.specialization = specialization;
        this.teachingStyle = teachingStyle;
        this.availability = availability;
    }


}
