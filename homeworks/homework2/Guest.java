package fapplication;

public class Guest {
	private int guestId;
	private String name;
	private String nationality;
	private int age;
	
	public Guest(int id , String name , String nat , int age) {
		guestId = id;
		this.name = name;
		nationality = nat;
		this.age = age;
	}
	
	public int guestId() {
		return guestId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public int getAge() {
		return age;
	}
	
	public void displayGuestInfo() {
		System.out.print("The ID is " + guestId );
		System.out.print(" and the name is " + name );
		System.out.print(" and the nationality is " + nationality );
		System.out.println(" and the age is " + age );
	}
}
