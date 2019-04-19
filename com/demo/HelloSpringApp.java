package com.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class); 
		
		System.out.println("-------------------------------------------");
		CricketCoach theCoach2 = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(theCoach2.getDailyFortune());
		System.out.println("random fortune: "+theCoach2.getRandomFortune());
		
//		Coach pingpongCoach = context.getBean("newInterface", Coach.class);
//		System.out.println(pingpongCoach.getDailyWorkout());
		context.close();
	}

}
