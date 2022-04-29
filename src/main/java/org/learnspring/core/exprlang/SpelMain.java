package org.learnspring.core.exprlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

public class SpelMain
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("exprlang.xml");
        Demo d1 = context.getBean("demo", Demo.class);
        System.out.println(d1);
        System.out.println(d1.myBool);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("22*2");
        String message = expression.getValue(String.class);
        System.out.println(message);

        Date date = new Date();
        System.out.println(date);
    }
}
