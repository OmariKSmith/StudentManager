
package com.studentmanagement.DAO;

import com.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudents() {
        String sql = "SELECT * FROM students";
        List<Student> studentList =  jdbcTemplate.query(sql, new StudentRowMapper());
        return studentList;
    }
}
