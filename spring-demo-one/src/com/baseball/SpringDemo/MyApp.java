package com.baseball.SpringDemo;

public class MyApp {

	public static void main(String[] args) {
		//create object using interface
		Coach theCoach = new TrackCoach();
		//use object
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
