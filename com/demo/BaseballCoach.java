package com.demo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune(); // making use of the dependency
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min";
	}
}
