package com.akhil.student;

import com.akhil.student.entity.Student;
import com.akhil.student.repository.StudentRepository;
import com.akhil.student.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class StudentSystemApplicationTests {

    @Autowired
    private StudentService service; // The thing we are testing

    @MockBean
    private StudentRepository repository; // The fake database connection

    @Test
    void testDuplicateEmailBlocker() {
        // --- 1. ARRANGE (Prepare the scenario) ---
        String duplicateEmail = "test@gmail.com";

        Student student = new Student();
        student.setName("Test User");
        student.setEmail(duplicateEmail);

        // Teach the Fake Repository to say "TRUE" when asked about this email
        // We are forcing the condition "Email already exists"
        Mockito.when(repository.existsByEmail(duplicateEmail)).thenReturn(true);

        // --- 2. ACT & ASSERT (Run logic and check for error) ---
        // We expect the service to throw a RuntimeException.
        // If it saves the student, the TEST FAILS.
        assertThrows(RuntimeException.class, () -> {
            service.saveStudent(student);
        });
    }
}