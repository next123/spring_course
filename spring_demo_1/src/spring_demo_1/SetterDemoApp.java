package spring_demo_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SetterCoach setterCoach = context.getBean("mySetterCoach", SetterCoach.class);

		System.out.println(setterCoach.getDailyWorkout() + setterCoach.getInjectionFromContext());

		System.out.println(setterCoach.getEmail());

		System.out.println(setterCoach.getMyName());
		context.close();
	}

}
