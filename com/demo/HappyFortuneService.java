package com.demo;

public class HappyFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return "callled getFortune";
	}
	public String getRandomFortune() {
		return "random fortune is returned";
	}
}
