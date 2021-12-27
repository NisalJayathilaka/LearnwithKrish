package com.Nisal;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Nisal","SSC","Sri Lanka",true);
        System.out.println(employee);

        Employee employee1 = new EmploueBuilder().setLocation("India").getEmploye();
        System.out.println(employee1);

    }
}
//        StudentTelescope1 studentTelescope1 = new StudentTelescope1("Nisal");
//        StudentTelescope1 studentTelescope11 = new StudentTelescope1("Nisal","SSC");
//
//        System.out.println(studentTelescope11);
//        System.out.println(studentTelescope1);

//        StudentTelescope2 studentTelescope2 = new StudentTelescope2("nisal","scc","pan",true);
//        System.out.println(studentTelescope2);

//        Student.Builder builder = new Student.Builder("Nisal");
//        Student student =builder.school("SSC").location("Sri Lanka").attend(true).build();
//        System.out.println(student);

