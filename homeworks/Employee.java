package fapplication;

public abstract class Employee {
	private String name;
	private int id;
	public Employee(String n , int i){
		name=n;
		id=i;
	}
	public Employee(Employee e){
		name =e.name;
		id=e.id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
 public void display(){
	 System.out.println("the name of the employee is: "+name);
	 System.out.println("the employee Id number is: "+id);
	 }
 public abstract double calculatePay();
}
