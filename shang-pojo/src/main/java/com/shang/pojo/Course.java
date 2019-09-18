package com.shang.pojo;

import java.io.Serializable;

public class Course implements Serializable{
    private String courseName;
    private Double coursePrice;
    private String Status;

    public Course() {
    }

    public Course(String courseName, Double coursePrice, String status) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        Status = status;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
