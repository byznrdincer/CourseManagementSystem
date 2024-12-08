
package edu.university.coursemanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Test profili kullanıyoruz
class CourseManagementSystemApplicationTests {

    @Test
    void contextLoads() {
        // Uygulama bağlamı yükleniyor mu kontrol eder.
    }
}
