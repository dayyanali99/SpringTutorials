package org.learnspring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean
{
    private double price;

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("taking pepsi: init");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Returning bottle after drinking...");
    }
}
