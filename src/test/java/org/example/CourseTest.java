package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class CourseTest {

    String courseName = "Backend Engineering";
    DateTime startDate = DateTime.parse("2022-09-01T00:00:00.000Z");
    DateTime endDate = DateTime.parse("2022-12-01T00:00:00.000Z");

    Course course = new Course(courseName, startDate, endDate);

    @Test
    public void testname(){
        assertEquals("name of course is Backend Engineering", "name of course is " + course.getCourseName());
    }

    @Test
    public void testStartDate(){
        assertEquals("start date of  course is 2022-09-01T00:00:00.000Z", "start date of  course is " + course.getStartDate());
    }

    @Test
    public void testModules(){
        Lecturer lecturer = new Lecturer("Lecturer1", 50, DateTime.parse("1972-09-01T00:00:00.000Z"),1234542);
        Module module= new Module("Intro to Java", lecturer);
        course.setModules(Arrays.asList(module));
        assertEquals("module(s) in the course are " + Arrays.asList(module), "module(s) in the course are " + course.getModules());
    }

    @Test
    public void testStudents(){
        Student student= new Student("Micheal",21, DateTime.parse("2001-01-01T00:00:00.000Z"), 1243432);
        course.setStudents(Arrays.asList(student));
        assertEquals("student(s) in the course are " + Arrays.asList(student), "student(s) in the course are " + course.getStudents());
    }
}