package com.springrest.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class college {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String College_ID;
    private String clg_name;

    public college() {
        this.College_ID = UUID.randomUUID().toString();
    }
     public college(String clg_name) {
        this.clg_name = clg_name;
     }

    public String getCollege_ID(){
        return College_ID;
    }

    public void setCollege_ID(String College_ID) {
        this.College_ID = College_ID;
    }


    public String getClg_name() {
        return clg_name;
    }

    public void setClg_name(String clg_name) {
        this.clg_name = clg_name;
    }
    @Override
    public String toString() {
        return "order{" +
                "College_ID='" + College_ID + '\'' +
                ", Clg_name='" + clg_name + '\'' +
                '}';
    }
}
