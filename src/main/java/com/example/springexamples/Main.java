package com.example.springexamples;

import com.example.springexamples.beans.AutowiringExample;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("app-config.xml");

        AutowiringExample example = ctx.getBean(AutowiringExample.class);

        System.out.println(example);
    }

}
