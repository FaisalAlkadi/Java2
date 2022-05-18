package fapplication;

public class TV_Program {
	private double audienceRate;
	public TV_Program(double a) {
		audienceRate =a;
	}
	public TV_Program(TV_Program P) {
		audienceRate=P.audienceRate;
	}
	public double getAudienceRate() {
		return audienceRate;
	}
	void display() {
		System.out.println("this is the audienceRate "+audienceRate);
	}
 
}
