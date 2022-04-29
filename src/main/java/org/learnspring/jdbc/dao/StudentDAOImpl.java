package org.learnspring.jdbc.dao;

import org.learnspring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDAOImpl implements StudentDAO
{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDAOImpl(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student)
    {
        String insQuery = "INSERT INTO student VALUES(?,?,?)";
        return this.jdbcTemplate.update(insQuery, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int change(Student student)
    {
        String updateQuery = "UPDATE student SET name=?, city=? WHERE id=?";
        return this.jdbcTemplate.update(updateQuery, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int delete(int studentId)
    {
        String delQuery = "DELETE FROM student WHERE id=?";
        return this.jdbcTemplate.update(delQuery, studentId);
    }

    @Override
    public Student getStudent(int studentId)
    {
        String query = "SELECT * FROM student WHERE id=?";
        return this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), studentId);
    }

    @Override
    public List<Student> getAllStudents()
    {
        String query = "SELECT * FROM student";
        return this.jdbcTemplate.query(query, new RowMapperImpl());
    }

    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
}
