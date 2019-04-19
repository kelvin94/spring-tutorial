package com.demo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: default constructor is called");
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmail() {
		return this.email;
	}
	public String getTeam() {
		return this.team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: setter injection is called.");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "CricketCoach: Practice cricet ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public String getRandomFortune() {
		return fortuneService.getRandomFortune();
	}

}
