package com.springrest.entity;
import javax.persistence.*;

@Entity
public class CollegeCourseDegree {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String CollegeCourseDegreeId;
    private Double Fees;
    private String CompletionTime;
    private String Description;
    private String courseId;
    private String degreeId;
    private String collegeId;

    public String getCollegeCourseDegreeId() {
        return CollegeCourseDegreeId;
    }
    public void setCollegeCourseDegreeId(String CollegeCourseDegreeId) {
        this.CollegeCourseDegreeId = CollegeCourseDegreeId;
    }
    public Double getFees() {
        return Fees;
    }
    public void setFees(Double Fees) {
        this.Fees = Fees;
    }
    public String getCompletionTime() {
        return CompletionTime;
    }
    public void setCompletionTime(String CompletionTime) {
        this.CompletionTime = CompletionTime;
    }
    public String getDescription() {
        return CollegeCourseDegreeId;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getcourseId() {
        return courseId;
    }
    public void setcourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getdegreeId() {
        return degreeId;
    }
    public void setdegreeId(String degreeId) {
        this.degreeId = degreeId;
    }
    public String getcollegeId() {
        return collegeId;
    }
    public void setcollegeId(String collegeId) {
        this.collegeId = collegeId;
    }
    @Override
    public String toString() {
        return "order{" +
                "college_course_degree_ID='" + CollegeCourseDegreeId + '\'' +
                ", Fees='" + Fees + '\'' +
                ", CompletionTime='" + CompletionTime + '\'' +
                ", Description='" + Description + '\'' +
                ", College_College_ID='" + collegeId + '\'' +
                ", Degree_Degree_ID='" + degreeId + '\'' +
                ", Course_Course_ID='" + courseId + '\'' +
                '}';
    }
}
