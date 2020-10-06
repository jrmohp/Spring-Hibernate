package com.jrm.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	/*public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
		// TODO Auto-generated constructor stub
		
	}*/
	@Override
	public String getDailyWorkout()
	{
		return "30 minutes in batting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void setDailyFortune(FortuneService thefortuneService) {
		// TODO Auto-generated method stub
		fortuneService = thefortuneService;
	}
}
