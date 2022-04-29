package org.learnspring.core.noxmlconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoXMLMain
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(Config.class, AnothaConfig.class);
        context.refresh();

//        DemoClass demoClass = context.getBean("myDemoClass",DemoClass.class);
//        System.out.println(demoClass);
//        demoClass.study();

        // we use the method name that has @Bean annotation as the getBean parameter to get the bean
        BeanAnnoClass beanAnnoClass = context.getBean("myAnnoBean", BeanAnnoClass.class);
        beanAnnoClass.check();

        // close() method doesn't exist in ApplicationContext Class
        context.close();
    }
}
