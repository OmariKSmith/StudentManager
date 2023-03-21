package com.studentmanagement.DAO;

import com.studentmanagement.model.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> loadStudents();
}
