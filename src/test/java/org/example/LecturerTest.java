package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LecturerTest {

    String name = "steve";
    int age = 50;
    DateTime dob = DateTime.parse("1972-01-01T00:00:00.000Z");
    int id = 1234;

    Lecturer lecturer = new Lecturer(name, age, dob, id);
    @Test
    public void testUsername() {
        assertEquals("username of user is steve50", "username of user is " + lecturer.getUsername());
    }

    @Test
    public void testDOB() {
        assertEquals("Users date of birth is 1972-01-01T00:00:00.000Z", "Users date of birth is " + lecturer.getDob());
    }

    @Test
    public void testId() {
        assertEquals("Users id is 1234", "Users id is " + lecturer.getId());
    }

    @Test
    public void testName() {
        assertEquals("Users name is steve", "Users name is " + lecturer.getName());
    }

    @Test
    public void testAge() {
        assertEquals("Users age is 50", "Users age is " + lecturer.getAge());
    }
}