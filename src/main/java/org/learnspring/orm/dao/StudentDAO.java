package org.learnspring.orm.dao;

import org.learnspring.orm.entities.Student;

import java.util.List;

public interface StudentDAO
{
    public int insert(Student student);
    public Student get(int studentId);
    public List<Student> getAllStudents();
    public void delete(int studentId);
    public void update(Student student);
}
