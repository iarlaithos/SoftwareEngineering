package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class StudentTest {

    String name = "iarlaith";
    int age = 21;
    DateTime dob = DateTime.parse("2001-01-01T00:00:00.000Z");
    int id = 1234;
    Student student = new Student(name, age, dob, id);

    @Test
    public void testUsername(){
        assertEquals("username of user is iarlaith21", "username of user is " + student.getUsername());
    }

    @Test
    public void testDOB(){
        assertEquals("Users date of birth is 2001-01-01T00:00:00.000Z", "Users date of birth is " + student.getDob());
    }

    @Test
    public void testId(){
        assertEquals("Users id is 1234", "Users id is " + student.getId());
    }

    @Test
    public void testName(){
        assertEquals("Users name is iarlaith", "Users name is " + student.getName());
    }

    @Test
    public void testAge(){
        assertEquals("Users age is 21", "Users age is " + student.getAge());
    }
}