package com.springrest.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class Degree {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String degreeId;
    private String DegreeName;
    private String DegreeType;
    private String collegeId;

    public void Degree() {
        this.degreeId = UUID.randomUUID().toString();
    }
    public Degree(String DegreeName, String DegreeType) {
        this.DegreeName = DegreeName;
        this.DegreeType = DegreeType;
    }

    public String getdegreeId(){
        return degreeId;
    }

    public void setdegreeId(String degreeId) {
        this.degreeId = degreeId;
    }


    public String getDegreeName() {
        return DegreeName;
    }

    public void setDegreeName(String DegreeName) {
        this.DegreeName = DegreeName;
    }
    public String getDegreeType() {
        return DegreeType;
    }

    public void setDegreeType(String DegreeType) {
        this.DegreeType = DegreeType;
    }
    public String getCollegeId() {
        return collegeId;
    }
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }



    @Override
    public String toString() {
        return "Degree{" +
                "Degree_ID='" + degreeId+ '\'' +
                ",DegreeName='" + DegreeName + '\'' +
                ",DegreeType='" + DegreeType + '\'' +
                "collegeId='" + collegeId + '\'' +'}';
    }
}
