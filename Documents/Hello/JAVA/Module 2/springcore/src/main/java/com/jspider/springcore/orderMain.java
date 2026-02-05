package com.jspider.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class orderMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-order.xml");

        Order o = (Order) context.getBean("order");
        o.display();

    }
}