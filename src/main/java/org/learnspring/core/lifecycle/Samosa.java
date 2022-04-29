package org.learnspring.core.lifecycle;

public class Samosa
{
    private double price;

    public Samosa()
    {
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        System.out.println("Setting price");
        this.price = price;
    }

    public void init()
    {
        System.out.println("Inside init method");
    }

    public void destroy()
    {
        System.out.println("Inside destroy method");
    }

    @Override
    public String toString()
    {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

}
