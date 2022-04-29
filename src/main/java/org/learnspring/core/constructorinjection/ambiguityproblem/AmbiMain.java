package org.learnspring.core.constructorinjection.ambiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiMain
{
    public static void main(String[] args)
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("ambiguityprob.xml");
       Addition addition = ((Addition) context.getBean("add"));
        System.out.println(addition.doSum());
    }
}
