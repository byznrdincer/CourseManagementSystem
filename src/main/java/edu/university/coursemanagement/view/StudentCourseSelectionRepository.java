/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author beyza
 */
package edu.university.coursemanagement.view;

import edu.university.coursemanagement.model.StudentCourseSelection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseSelectionRepository extends JpaRepository<StudentCourseSelection, Integer> {
    // Burada, StudentCourseSelection'a özgü sorgular eklenebilir.
}
