package org.learnspring.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Epic
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

    @PostConstruct
    public void start()
    {
        System.out.println("init method...");
    }

    @PreDestroy
    public void end()
    {
        System.out.println("destroy method...");
    }

    @Override
    public String toString()
    {
        return "Epic{" +
                "price=" + price +
                '}';
    }
}
