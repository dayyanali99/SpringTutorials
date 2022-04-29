package org.learnspring.core.noxmlconf;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class BeanAnnoClass implements Serializable
{
    private int x;

    @Autowired // calls the getPakora() method to get the bean and inject it
    private Pakora pakora;

    public BeanAnnoClass()
    {
    }


    public BeanAnnoClass(Pakora pakora)
    {
        this.pakora = pakora;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public Pakora getPakora()
    {
        return pakora;
    }

    public void setPakora(Pakora pakora)
    {
        this.pakora = pakora;
    }

    public void check()
    {
        System.out.println("BeanAnno object made...");
        pakora.eatPakora();
    }

    public void myInit()
    {
        System.out.println("inside init...");
    }

    public void myDestroy()
    {
        System.out.println("my destroy...");
    }
}
