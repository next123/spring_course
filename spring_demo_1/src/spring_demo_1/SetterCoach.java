package spring_demo_1;

public class SetterCoach implements Coach {

	private InjectionService injectionService;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("set email" + email);
		this.email = email;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		System.out.println("set email" + myName);
		this.myName = myName;
	}

	private String myName;

	public SetterCoach() {
		System.out.println("Inside constructor");
	}

	public void setInjectionService(InjectionService injectionService) {
		System.out.println("Inside setInjectionService");
		this.injectionService = injectionService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is the setter getDailyWorkout";
	}

	@Override
	public String getInjectionFromContext() {
		return "This is the setter getInjectionFromContext" + injectionService.getText();
	}

}
