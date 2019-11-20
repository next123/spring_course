package spring_demo_1;

public class BaseballCouch implements Coach {

	private InjectionService injectionService;

	public BaseballCouch(InjectionService theinjectionService) {
		injectionService = theinjectionService;
	}

	@Override
	public String getDailyWorkout() {
		return "Sample string";
	}

	@Override
	public String getInjectionFromContext() {
		return injectionService.getText();
	}

}
