package com.demo;

public class NewFortuneService implements FortuneService{
	@Override
	public String getFortune() {
		return "New - callled getFortune";
	}
	public String getRandomFortune() {
		return " New - random fortune is returned";
	}
}
