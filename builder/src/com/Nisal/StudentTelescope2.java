package com.Nisal;

public class StudentTelescope2 {

    String name;
    String school;
    String location;
    Boolean attend;

    public StudentTelescope2(String name, String school, String location, Boolean attend) {
        this.name = name;
        this.school = school;
        this.location = location;
        this.attend = attend;
    }

    public StudentTelescope2(String name, String school, String location) {
        this(name,school,location,null);
    }

    public StudentTelescope2(String name, String school) {
        this(name,school,null);
    }

    public StudentTelescope2(String name) {
        this(name,null);
    }

    @Override
    public String toString() {
        return "StudentTelescope2{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", location='" + location + '\'' +
                ", attend=" + attend +
                '}';
    }
}
