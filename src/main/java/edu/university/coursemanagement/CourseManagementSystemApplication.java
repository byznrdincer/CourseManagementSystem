package edu.university.coursemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "edu.university.coursemanagement.model") // Entity'leri bu paketten tarıyoruz
@EnableJpaRepositories(basePackages = "edu.university.coursemanagement.repository") // Repository'leri bu paketten tarıyoruz
public class CourseManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseManagementSystemApplication.class, args);
    }
}
