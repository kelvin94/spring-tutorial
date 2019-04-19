package com.demo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard long - Track Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just doing it: " + fortuneService.getFortune();
	}

}
