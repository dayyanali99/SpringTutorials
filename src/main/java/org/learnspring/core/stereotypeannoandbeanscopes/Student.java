package org.learnspring.core.stereotypeannoandbeanscopes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component("myStudent") // makes type Student var with this var-name for spring container
@Scope("prototype") // singleton is the default bean scope
public class Student implements Serializable
{
    @Value("Dayyan Ali") // explicitly injects value into fields
    private String studentName;
    @Value("Karachi")
    private String city;

    // Using Sp-EL to inject StandAlone collection
    @Value("#{myList}")
    private List<String> addresses;

    public Student()
    {
    }

    public Student(String studentName, String city)
    {
        this.studentName = studentName;
        this.city = city;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public List<String> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(List<String> addresses)
    {
        this.addresses = addresses;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
