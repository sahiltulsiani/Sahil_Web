package com.springrest.entity;
import javax.persistence.*;
import java.util.UUID;


@Entity
public class College {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String collegeId;
    private String clgname;

    public void College() {
        this.collegeId = UUID.randomUUID().toString();
    }
     public void College(String clgname) {
        this.clgname = clgname;
     }

    public String getcollegeId(){
        return collegeId;
    }

    public void setcollegeId(String collegeId) {
        this.collegeId = collegeId;
    }


    public String getClgname() {
        return clgname;
    }

    public void setClgname(String clgname) {
        this.clgname = clgname;
    }
    @Override
    public String toString() {
        return "order{" +
                "College_ID='" + collegeId + '\'' +
                ", Clg_name='" + clgname + '\'' +
                '}';
    }
}
