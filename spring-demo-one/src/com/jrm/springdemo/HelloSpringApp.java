package com.jrm.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
		//load spring config
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach baseCoach = context.getBean("myBaseball",Coach.class);
		
		
		
		///call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//
		System.out.println(baseCoach.getDailyWorkout());
		System.out.println(baseCoach.getDailyFortune());
		
		///close contect
		context.close();
	}

}
