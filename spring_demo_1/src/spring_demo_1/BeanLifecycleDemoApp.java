package spring_demo_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext2.xml");

		Coach coach = context.getBean("myCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		context.close();

	}

}
