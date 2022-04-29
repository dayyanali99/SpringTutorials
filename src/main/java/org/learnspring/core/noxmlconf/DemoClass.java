package org.learnspring.core.noxmlconf;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component("myDemoClass")
public class DemoClass implements Serializable
{
    private int x;
    private List<Integer> myList;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public List<Integer> getMyList()
    {
        return myList;
    }

    public void setMyList(List<Integer> myList)
    {
        this.myList = myList;
    }

    public void study()
    {
        System.out.println("Student is Studying...");
    }

    @Override
    public String toString()
    {
        return "DemoClass{" +
                "x=" + x +
                ", myList=" + myList +
                '}';
    }
}
