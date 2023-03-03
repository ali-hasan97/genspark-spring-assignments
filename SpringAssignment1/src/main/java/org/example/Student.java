package org.example;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public int getId() {return id;}

    public void setId(int newId) {id = newId;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "I am a student. ID: " + id +
                ", Name: " + name +
                ", Phone numbers: " + ph +
                ", Address: " + add;
    }
}
