package org.learnspring.core.setterinjection.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconf.xml");
        A a = (A) context.getBean("arefer");
        System.out.println(a);
        System.out.println(a.getB().getY());
    }
}
