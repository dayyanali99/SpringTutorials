package org.learnspring.core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain
{
    public static void main(String[] args)
    {
        // Implementing Bean LifeCycle methods using XML
        // AbstractApplicationContext has the method to register ShutdownHook
        // which calls the destroy method of beans
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();

//        Samosa s1 = ((Samosa) context.getBean("s1"));
//        System.out.println(s1);
//        System.out.println("-----------------------------------------------------------");

        // Implementing Bean LifeCycle methods using Interfaces
//        Pepsi p1 = ((Pepsi) context.getBean("p1"));
//        System.out.println(p1);
//        System.out.println("-----------------------------------------------------------");

        // Implementing Bean LifeCycle methods using Interfaces
        Epic e1 = ((Epic) context.getBean("e1"));
        System.out.println(e1);

    }
}
