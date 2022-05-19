public class TV_Program {
	private String name;
	private double audienceRate;
	private String day;
	private int time;
	
	
	
	public TV_Program(String name, double audienceRate, String day, int time) {
		this.name = name;
		this.audienceRate = audienceRate;
		this.day = day;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public double getAudienceRate() {
		return audienceRate;
	}
	public String getDay() {
		return day;
	}
	public int getTime() {
		return time;
	}
	
	
	
	}
