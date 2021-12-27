package com.Nisal;

public class EmploueBuilder {

    private  String name;
    private  String school;
    private  String location;
    private  Boolean attend;

    public EmploueBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmploueBuilder setSchool(String school) {
        this.school = school;
        return this;
    }

    public EmploueBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public EmploueBuilder setAttend(Boolean attend) {
        this.attend = attend;
        return this;
    }

    public Employee getEmploye()
    {
        return new Employee(name,school,location,attend);
    }
}
