package com.studentmanagement.controllers;

import com.studentmanagement.DAO.StudentDAO;
import com.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/students")
    public String showStudentPage(Model model){
        //call DAO to retrieve data
        List<Student> studentList = studentDAO.loadStudents();
        //bind data to jsp holder Model
        model.addAttribute("students", studentList);

        return "display-student-page";
    }
}
