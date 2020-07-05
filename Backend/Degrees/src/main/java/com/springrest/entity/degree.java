package com.springrest.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class degree {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String Degree_ID;
    private String Degree_name;
    private String Degree_Type;
    private String College_College_ID;

    public void User() {
        this.Degree_ID = UUID.randomUUID().toString();
    }
    public degree(String Degree_name, String Degree_Type) {
        this.Degree_name = Degree_name;
        this.Degree_Type = Degree_Type;
    }

    public String getDegree_ID(){
        return Degree_ID;
    }

    public void setDegree_ID(String Degree_ID) {
        this.Degree_ID = Degree_ID;
    }


    public String getDegree_name() {
        return Degree_name;
    }

    public void setDegree_name(String Degree_name) {
        this.Degree_name = Degree_name;
    }
    public String getDegree_Type() {
        return Degree_Type;
    }

    public void setDegree_Typr(String Degree_Type) {
        this.Degree_Type = Degree_Type;
    }
    public String getCollege_College_ID() {
        return College_College_ID;
    }
    public void setCollege_College_ID(String College_College_ID) {
        this.College_College_ID = College_College_ID;
    }



    @Override
    public String toString() {
        return "User{" +
                "Degree_ID='" + Degree_ID+ '\'' +
                ",Degree_name='" + Degree_name + '\'' +
                ",Degree_Type='" + Degree_Type + '\'' +
                "College_College_ID='" + College_College_ID+ '\'' +'}';
    }
}
