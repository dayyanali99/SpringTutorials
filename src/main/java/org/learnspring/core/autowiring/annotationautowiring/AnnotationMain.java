package org.learnspring.core.autowiring.annotationautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Employee emp = ((Employee) context.getBean("emp2"));
        System.out.println(emp);
    }
}
