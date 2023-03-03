package org.example;

import org.springframework.stereotype.Component;

public class Phone {
    private String mob;

    Phone(String mob) {this.mob = mob;}

    @Override
    public String toString() {
        return mob;
    }
}
