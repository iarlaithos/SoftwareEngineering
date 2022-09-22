package org.example;

import org.joda.time.DateTime;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private List<Course> courses;
    private List<Module> modules;

    public Student(String name, int age, DateTime dob, int id, List<Course> courses, List<Module> modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.courses = courses;
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        username = name + age;
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", courses=" + courses +
                ", modules=" + modules +
                '}';
    }
}
