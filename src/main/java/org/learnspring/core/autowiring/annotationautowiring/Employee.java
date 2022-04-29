package org.learnspring.core.autowiring.annotationautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

public class Employee implements Serializable
{
    @Autowired
    @Qualifier("address3")
    private Address address;

    public Employee()
    {
    }

    @Autowired
    public Employee(@Qualifier("address3") Address address)
    {
        this.address = address;
    }

    public Address getAddress()
    {
        return address;
    }

//    @Autowired
    public void setAddress( Address address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
