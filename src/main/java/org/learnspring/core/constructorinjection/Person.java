package org.learnspring.core.constructorinjection;

import java.util.ArrayList;

public class Person
{
    private String name;
    private int personId;
    private Certi certi;
    private ArrayList<Integer> list;

    public Person(String name, int personId)
    {
        this.name = name;
        this.personId = personId;
    }

    public Person(String name, int personId, Certi certi, ArrayList<Integer> list)
    {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.list = list;
    }


}
