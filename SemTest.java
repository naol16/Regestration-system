package student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class SemTest {

    @Test
    public void testSemister11() {
        Semister11 semister11 = new Semister11("Math", 3, "Professor A");
        semister11.objectadding(semister11);

        assertEquals(1, Semister11.semi11.size());

        Semister11 retrievedSemester = Semister11.semi11.get(0);
        assertEquals("Math", retrievedSemester.getcourse());
        assertEquals(3, retrievedSemester.getcredit());
        assertEquals("Professor A", retrievedSemester.getinstructor());
    }

    @Test
    public void testSemister12() {
        Semister12 semister12 = new Semister12("English", 4, "Professor B");
        semister12.objectadding(semister12);

        assertEquals(1, Semister12.semi12.size());

        Semister12 retrievedSemester = Semister12.semi12.get(0);
        assertEquals("English", retrievedSemester.getcourse());
        assertEquals(4, retrievedSemester.getcredit());
        assertEquals("Professor B", retrievedSemester.getinstructor());
    }

    // Add similar tests for other Semister classes

    @Test
    public void testSemister51() {
        Semister51 semister51 = new Semister51("Physics", 3, "Professor E");
        semister51.objectadding(semister51);

        assertEquals(1, Semister51.semi51.size());

        Semister51 retrievedSemester = Semister51.semi51.get(0);
        assertEquals("Physics", retrievedSemester.getcourse());
        assertEquals(3, retrievedSemester.getcredit());
        assertEquals("Professor E", retrievedSemester.getinstructor());
    }

    @Test
    public void testSemister52() {
        Semister52 semister52 = new Semister52("Chemistry", 4, "Professor F");
        semister52.objectadding(semister52);

        assertEquals(1, Semister52.semi52.size());

        Semister52 retrievedSemester = Semister52.semi52.get(0);
        assertEquals("Chemistry", retrievedSemester.getcourse());
        assertEquals(4, retrievedSemester.getcredit());
        assertEquals("Professor F", retrievedSemester.getinstructor());
    }
@Test
 public    void testRegistrationAndDisplay() {
        Student student = new Student("John Doe", 2023, "12345");

        // Register the student
        student.regestration(student);

        // Retrieve the list of registered students
        List<Student> registeredStudents = Student.getRegestered();

        // Ensure that the list contains the registered student
        assertTrue(registeredStudents.contains(student));

        // Display information for each registered student
        for (Student registeredStudent : registeredStudents) {
            registeredStudent.display();
        }
    }

    @Test
 public   void testRemoving() {
        Student student1 = new Student("Alice", 2023, "111");
        Student student2 = new Student("Bob", 2023, "222");

        
        student1.regestration(student1);
        student2.regestration(student2);

    
        student1.removing("111");

        assertFalse(Student.getRegestered().contains(student1));
        assertTrue(Student.getRegestered().contains(student2));
    }
}






