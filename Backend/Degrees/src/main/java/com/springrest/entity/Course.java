package com.springrest.entity;
import javax.persistence.*;

@Entity
public class Course {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String courseId;
    private String CourseName;
    private String degreeId;

    public Course(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getcourseId(){
        return courseId;
    }

    public void setcourseId(String courseId) {
        this.courseId = courseId;
    }


    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    public String getDegreeId() {
        return degreeId;
    }
    public void setDegreeId(String degreeId) {
        this.degreeId = degreeId;
    }



    @Override
    public String toString() {
        return "Degree{" +
                "Course_ID='" + courseId+ '\'' +
                ",CourseName='" + CourseName + '\'' +
                "degreeId='" + degreeId + '\'' +'}';
    }
}


