package com.example.springexamples.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiringExample {

    private ExampleEntity bean;
    private String message;

    @Autowired
    public AutowiringExample(String message) {
        this.message = message;
    }

    @Autowired
    public void setBean(ExampleEntity bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return bean.toString() + " in AutowiringExample class " + message;
    }
}
