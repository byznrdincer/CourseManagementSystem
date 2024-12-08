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

@Entity
@Table(name = "Advisors")
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int advisorID;

    private String fullName;
    private String title;
    private String department;

    @Column(unique = true, nullable = false)
    private String email;

    // Getter ve Setter'lar
    public int getAdvisorID() {
        return advisorID;
    }

    public void setAdvisorID(int advisorID) {
        this.advisorID = advisorID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
