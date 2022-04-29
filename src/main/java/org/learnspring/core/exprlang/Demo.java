package org.learnspring.core.exprlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
    @Value("#{22+10}")
    private int x;
    @Value("#{2*25}")
    private int y;

    // Calling static methods of any class. T is necessary before class name
    @Value("#{T(Math).sqrt(25)}")
    private double z;

    @Value("#{T(Math).PI}")
    private double pi;

    @Value("#{new String('Dayyan Ali')}")
    private String name;

    @Value("#{2 == 2}")
    public boolean myBool;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double getZ()
    {
        return z;
    }

    public void setZ(double z)
    {
        this.z = z;
    }

    public double getPi()
    {
        return pi;
    }

    public void setPi(double pi)
    {
        this.pi = pi;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isMyBool()
    {
        return myBool;
    }

    public void setMyBool(boolean myBool)
    {
        this.myBool = myBool;
    }

    @Override
    public String toString()
    {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", pi=" + pi +
                ", name='" + name + '\'' +
                '}';
    }
}
