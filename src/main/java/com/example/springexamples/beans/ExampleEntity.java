package com.example.springexamples.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleEntity {

    @Override
    public String toString() {
        return "ExampleBean's working";
    }
}
