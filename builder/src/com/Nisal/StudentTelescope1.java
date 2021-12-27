package com.Nisal;

public class StudentTelescope1 {

    String name;
    String school;
    String location;
    Boolean attend;

    public StudentTelescope1(String name) {
        this.name = name;
    }

    public StudentTelescope1(String name, String school) {
        this(name);
        this.school = school;
    }

    public StudentTelescope1(String name, String school, String location) {
        this(name, school);
        this.location = location;
    }

    public StudentTelescope1(String name, String school, String location, Boolean attend) {
        this(name, school, location);
        this.attend = attend;
    }

    @Override
    public String toString() {
        return "StudentTelescope1{" +
                "name='" + name + '\'' +
                ", School='" + school + '\'' +
                ", location='" + location + '\'' +
                ", attend=" + attend +
                '}';
    }
}
