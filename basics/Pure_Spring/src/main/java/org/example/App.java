package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Dev obj= (Dev)context.getBean("dev");
//        obj.build();
        System.out.println(obj.getAge());

    }
}
