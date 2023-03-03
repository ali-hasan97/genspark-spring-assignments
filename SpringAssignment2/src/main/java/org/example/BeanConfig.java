package org.example;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Address address() {
        return new Address("Los Angeles", "California", "United States", "12345");
    }

    @Bean
    public List<Phone> phoneList() {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("123"));
        phoneList.add(new Phone("456"));
        phoneList.add(new Phone("789"));

        return phoneList;
    }

    @Bean
    @Autowired
    public Student getStudent(List<Phone> phones, Address address) {
        return new Student(3, "Ali", phones, address);
    }
}
