package org.learnspring.core.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecoll.xml");
        Person p1 = ((Person) context.getBean("person1"));
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println("=====================================================");

        Person p2 = ((Person) context.getBean("person2"));
        System.out.println(p2);
        System.out.println(p2.getFeeStructure().getClass().getName());
        System.out.println(p2.getProperties());
        System.out.println("=====================================================");
    }
}
