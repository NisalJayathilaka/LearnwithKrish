package com.Nisal;

public class Employee {

    private  String name;
    private  String school;
    private  String location;
    private  Boolean attend;

    public Employee(String name, String school, String location, Boolean attend) {
        this.name = name;
        this.school = school;
        this.location = location;
        this.attend = attend;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", location='" + location + '\'' +
                ", attend=" + attend +
                '}';
    }
}
