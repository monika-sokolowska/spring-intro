package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        MessageService messageService = ctx.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());


    }
}
