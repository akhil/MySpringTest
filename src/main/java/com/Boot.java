package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by akhil on 8/25/17.
 */
public class Boot {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyMain myMain = (MyMain) context.getBean("myMain");
        System.out.println(myMain.upCase("Ssss"));
        //HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        //obj.getMessage();
    }
}
