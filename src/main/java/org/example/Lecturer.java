package org.example;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Lecturer {
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private List<Module> modules;

    public Lecturer(String name, int age, DateTime dob, int id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = new ArrayList<Module>();
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

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void addModule(Module module){
        this.modules.add(module);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", modules=" + modules +
                '}';
    }
}

