package org.example;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moduleName;
    private List<Student> students;
    private List<Course> courses;
    private Lecturer lecturer;

    public Module(String moduleName, Lecturer lecturer) {
        this.moduleName = moduleName;
        this.lecturer = lecturer;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    @Override
    public String toString() {
        return "Module{" +
                "moduleName='" + moduleName + '\'' +
                ", students=" + students +
                ", courses=" + courses +
                ", lecturer=" + lecturer +
                '}';
    }
}
