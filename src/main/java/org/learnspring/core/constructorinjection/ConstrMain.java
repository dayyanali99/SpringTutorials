package org.learnspring.core.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
