package spring_demo_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean
		Coach coach = context.getBean("myCoach", Coach.class);

		// use method
		System.out.println(coach.getDailyWorkout());

		// close context
		context.close();
	}

}
