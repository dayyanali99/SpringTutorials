package org.learnspring.core.autowiring.xmlautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Employee emp = ((Employee) context.getBean("emp1"));
        System.out.println(emp);
    }
}
