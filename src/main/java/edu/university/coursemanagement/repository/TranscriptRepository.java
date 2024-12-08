/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author beyza
 */
package edu.university.coursemanagement.repository;

import edu.university.coursemanagement.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepository extends JpaRepository<Transcript, Integer> {
    // Burada, Transcript'a özgü sorgular eklenebilir.
}
