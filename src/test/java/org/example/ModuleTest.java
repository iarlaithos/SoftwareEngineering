package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class ModuleTest {

    String moduleName = "Intro to Java";
    Lecturer lecturer = new Lecturer("Lecturer1", 50, DateTime.parse("2072-09-01T00:00:00.000Z"),1234542);

    Module module = new Module(moduleName, lecturer);

    @Test
    public void testName(){
        assertEquals("The name of the module is Intro to Java", "The name of the module is " + module.getModuleName());
    }

    @Test
    public void testLecturer(){
        assertEquals("The lecturer of the module is " + lecturer, "The lecturer of the module is " + module.getLecturer());
    }

    @Test
    public void testStudents(){
        Student student= new Student("Micheal",21, DateTime.parse("2001-01-01T00:00:00.000Z"), 1243432);
        module.setStudents(Arrays.asList(student));
        assertEquals("student(s) in the module are " + Arrays.asList(student), "student(s) in the module are " + module.getStudents());
    }

    @Test
    public void testCourses(){
        Course course= new Course("Backend Engineering", DateTime.parse("2022-09-01T00:00:00.000Z"), DateTime.parse("2022-12-01T00:00:00.000Z"));
        module.setCourses(Arrays.asList(course));
        assertEquals("course(s) in the module are " + Arrays.asList(course), "course(s) in the module are " + module.getCourses());
    }
}