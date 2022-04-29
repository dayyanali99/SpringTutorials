package org.learnspring.jdbc;

import org.learnspring.jdbc.dao.StudentDAO;
import org.learnspring.jdbc.entities.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class JdbcJavaConfigMain
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JdbcConfig.class);


        StudentDAO studentDao = context.getBean("studentDao", StudentDAO.class);

        ArrayList<Student> stuList = (ArrayList<Student>) studentDao.getAllStudents();

        for (Student s : stuList)
        {
            System.out.println(s);
        }

        context.close();
    }
}
