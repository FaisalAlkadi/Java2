package fapplication;

public class Video {
	private int id;
	private String title;
	private int duration;
	private category Category;
	
	public Video(int id,String title,int duration,category Category) {
		this.id=id;
		this.title=title;
		this.duration=duration;
		this.Category=Category;
		
	}

	public int getDuration() {
		return duration;
	}

	public category getCategory() {
		return Category;
	}
	public void display() {
		System.out.print("The ID is " + id );
		System.out.print(" and the title is " + title );
		System.out.print(" and the duration is " + duration );
		System.out.println(" and the Category is " + Category );
	}
	

}
