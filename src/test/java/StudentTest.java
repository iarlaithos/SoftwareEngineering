import org.example.Course;
import org.example.Module;
import org.example.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    String name = "iarlaith";
    int age = 21;
    DateTime dob = DateTime.parse("2001-01-01T00:00:00.000Z");
    int id;
    String username;
    List<Course> courses;
    List<Module> modules;

    Student student = new Student(name, age, dob, id, courses, modules);

    @Test
    public void testUsername(){
        assertEquals("username of user is iarlaith21", "username of user is " + student.getUsername());
    }

    @Test
    public void testDOB(){
        assertEquals("Users date of birth is 2001-01-01T00:00:00.000Z", "Users date of birth is " + student.getDob());
    }

}
