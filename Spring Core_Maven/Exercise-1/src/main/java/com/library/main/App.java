package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class App {

    public static void main(String[] args) {

        // Load Spring context
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get bean
        BookService service =
                (BookService) context.getBean("bookService");

        // Call method
        service.addBook();

        System.out.println("Spring application running successfully");
    }
}