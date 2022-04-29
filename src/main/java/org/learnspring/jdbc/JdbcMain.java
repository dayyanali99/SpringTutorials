package org.learnspring.jdbc;

import org.learnspring.jdbc.dao.StudentDAO;
import org.learnspring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class JdbcMain
{
    public static void main(String[] args)
    {
        System.out.println("Program started...");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbcconfig.xml");

//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//        INSERTING DATA

        // insert query
        String insQuery = "INSERT INTO student VALUES(?,?,?)";

        // fire query
//        int result = template.update(insQuery, 765,"Sara Sultan", "Model Colony");
//        System.out.println("numbers of records inserted... "+result);

        // Following is the recommended way
        StudentDAO studentDao = context.getBean("studentDao", StudentDAO.class);
//        Student student = new Student();
//        student.setId(666);
//        student.setName("Bruce Dickinson");
//        student.setCity("Iron Maiden");
//
//        int result = studentDao.insert(student);
//        System.out.println(result);

//        UPDATING DATA

//        Student student = new Student();
//        student.setId(666);
//        student.setName("Saadi Hmm");
//        student.setCity("Kazimabad");
//        int result = studentDao.change(student);
//        System.out.println(result);

//        DELETING DATA

//        int r = studentDao.delete(666);
//        System.out.println(r);

//        QUERYING DATA

//        Student student = studentDao.getStudent(8452);
//        System.out.println(student);

        ArrayList<Student> studentList = (ArrayList<Student>) studentDao.getAllStudents();
        for (Student s: studentList)
        {
            System.out.println(s);
        }

    }
}
