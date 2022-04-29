package org.learnspring.orm;

import org.learnspring.orm.dao.StudentDAO;
import org.learnspring.orm.dao.StudentDAOImpl;
import org.learnspring.orm.entities.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("orm/ormconf.xml"))
        {
            StudentDAO studentDAO = context.getBean("studentDAO", StudentDAOImpl.class);

            Student s1 = new Student(14,"Xabi Alonso","Madrid");
            int r = studentDAO.insert(s1);
            System.out.println("done : "+r);
        }
    }
}
