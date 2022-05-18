package fapplication;

public class AudioBook extends Book{
	private int duration;
	private String narrator;

	public AudioBook(String ti, String au,int du,String na) {
		super(ti, au);
		duration=du;
		narrator=na;
		
	}

	public int getDuration() {
		return duration;
	}

	public String getNarrator() {
		return narrator;
	}

	public String toString() {
		return "AudioBook [duration=" + duration + ", narrator=" + narrator + "]";
	}
	

}
