package com.springrest.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class college_course_degree {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String college_course_degree_ID;
    private Double Fees;
    private String Completion_time;
    private String Description;
    private String Course_Course_ID;
    private String Degree_Degree_ID;
    private String College_College_ID;

    public String getcollege_course_degree_ID() {
        return college_course_degree_ID;
    }
    public void setcollege_course_degree_ID(String college_course_degree_ID) {
        this.college_course_degree_ID = college_course_degree_ID;
    }
    public Double getFees() {
        return Fees;
    }
    public void setFees(Double Fees) {
        this.Fees = Fees;
    }
    public String Completion_time() {
        return Completion_time;
    }
    public void setCompletion_time(String Completion_time) {
        this.Completion_time = Completion_time;
    }
    public String getDescription() {
        return college_course_degree_ID;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getCourse_Course_ID() {
        return Course_Course_ID;
    }
    public void setCourse_Course_ID(String Course_Course_ID) {
        this.Course_Course_ID = Course_Course_ID;
    }
    public String getDegree_Degree_ID() {
        return Degree_Degree_ID;
    }
    public void setDegree_Degree_ID(String Degree_Degree_ID) {
        this.Degree_Degree_ID = Degree_Degree_ID;
    }
    public String getCollege_College_ID() {
        return College_College_ID;
    }
    public void setCollege_College_ID(String College_College_ID) {
        this.College_College_ID = College_College_ID;
    }
    @Override
    public String toString() {
        return "order{" +
                "college_course_degree_ID='" + college_course_degree_ID + '\'' +
                ", Fees='" + Fees + '\'' +
                ", Completion_time='" + Completion_time + '\'' +
                ", Description='" + Description + '\'' +
                ", College_College_ID='" + College_College_ID + '\'' +
                ", Degree_Degree_ID='" + Degree_Degree_ID + '\'' +
                ", Course_Course_ID='" + Course_Course_ID + '\'' +
                '}';
    }
}
