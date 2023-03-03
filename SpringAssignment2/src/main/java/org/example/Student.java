package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
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
