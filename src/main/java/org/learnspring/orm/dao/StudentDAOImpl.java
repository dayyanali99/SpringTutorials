package org.learnspring.orm.dao;

import org.learnspring.orm.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class StudentDAOImpl implements StudentDAO
{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public StudentDAOImpl()
    {
    }

    public StudentDAOImpl(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate = hibernateTemplate;
    }


    public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int insert(Student student)
    {
        return (int) this.hibernateTemplate.save(student);
    }

    @Override
    public Student get(int studentId)
    {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    @Override
    public List<Student> getAllStudents()
    {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Override
    public void delete(int studentId)
    {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        if (student != null)
            this.hibernateTemplate.delete(student);
    }

    @Override
    public void update(Student student)
    {
        this.hibernateTemplate.update(student);
    }
}
