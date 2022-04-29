package org.learnspring.core.stereotypeannoandbeanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoAndBeanScopesMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        Student s1 = context.getBean("myStudent", Student.class);
        System.out.println(s1);
        System.out.println(s1.getAddresses());
        System.out.println(s1.getAddresses().getClass().getName());
        System.out.println("=====================================");


        // Printing hashcodes to see if it's the same object or not
        System.out.println(s1.hashCode());
        Student s2 = context.getBean("myStudent",Student.class);
        System.out.println(s2.hashCode());
    }
}
