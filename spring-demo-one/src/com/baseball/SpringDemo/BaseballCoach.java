package com.baseball.SpringDemo;

public class BaseballCoach implements Coach {
	
	@Override //polymorphic!
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice."; 
	}

}
