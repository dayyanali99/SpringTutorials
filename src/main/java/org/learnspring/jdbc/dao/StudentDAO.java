package org.learnspring.jdbc.dao;

import org.learnspring.jdbc.entities.Student;

import java.util.List;

public interface StudentDAO
{
    public int insert(Student student);
    public int change(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
}
