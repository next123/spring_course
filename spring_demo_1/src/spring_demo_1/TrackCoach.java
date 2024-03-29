package spring_demo_1;

public class TrackCoach implements Coach {

	private InjectionService injectionService;

	public TrackCoach(InjectionService injectionService) {
		super();
		this.injectionService = injectionService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Sample string for track";
	}

	@Override
	public String getInjectionFromContext() {
		// TODO Auto-generated method stub
		return "From Track" + this.injectionService.getText();
	}

	public void doOninit() {
		System.out.println("oninit");
	}

	public void doOnDestroy() {
		System.out.println("ondestroy");
	}

}
