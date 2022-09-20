package org.example;

import java.util.List;

public class Module {
    private String moduleName;
    private List<Student> students;
    private List<Course> courses;
    private Lecturer lecturer;

    public Module(String moduleName, List<Student> students, List<Course> courses, Lecturer lecturer) {
        this.moduleName = moduleName;
        this.students = students;
        this.courses = courses;
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
