package com.springrest.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class course {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String Course_ID;
    private String Course_name;
    private String Degree_Degree_ID;

    public course(String Course_name) {
        this.Course_name = Course_name;
    }

    public String getCourse_ID(){
        return Course_ID;
    }

    public void setCourse_ID(String Course_ID) {
        this.Course_ID = Course_ID;
    }


    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String Course_name) {
        this.Course_name = Course_name;
    }
    public String getDegree_Degree_ID() {
        return Degree_Degree_ID;
    }
    public void setDegree_Degree_ID(String Degree_Degree_ID) {
        this.Degree_Degree_ID = Degree_Degree_ID;
    }



    @Override
    public String toString() {
        return "User{" +
                "Course_ID='" + Course_ID+ '\'' +
                ",Course_name='" + Course_name + '\'' +
                "Degree_Degree_ID='" + Degree_Degree_ID+ '\'' +'}';
    }
}


