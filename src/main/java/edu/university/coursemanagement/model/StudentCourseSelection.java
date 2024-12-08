/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author beyza
 */
package edu.university.coursemanagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "StudentCourseSelections")
public class StudentCourseSelection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int selectionID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "studentID")
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseID")
    private Course course;

    @Temporal(TemporalType.DATE)
    private Date selectionDate;

    private boolean isApproved;

    // Getter ve Setter'lar
    public int getSelectionID() {
        return selectionID;
    }

    public void setSelectionID(int selectionID) {
        this.selectionID = selectionID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getSelectionDate() {
        return selectionDate;
    }

    public void setSelectionDate(Date selectionDate) {
        this.selectionDate = selectionDate;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}
