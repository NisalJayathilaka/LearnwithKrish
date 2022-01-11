package com.nisal.rentacar.demoapplication.servicer;

import com.nisal.rentacar.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);

   public Student fetchStudentById(int id);
}
