package spring_demo_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach theCoach1 = context.getBean("myCoach", Coach.class);

		boolean check = (theCoach == theCoach1);

		System.out.println(check);

		System.out.println("\nMemory location for 1: " + theCoach);
		System.out.println("\nMemory location for 2: " + theCoach1);

	}

}
