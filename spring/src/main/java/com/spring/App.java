package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
  
	public static void main( String[] args )
	{		
		
		System.out.println("hello world");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		student student1=(student)context.getBean("student1");
		System.out.println(student1);

		
    }

}
