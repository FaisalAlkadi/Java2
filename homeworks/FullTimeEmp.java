package fapplication;

public class FullTimeEmp extends Employee {
	private int salary;
	public FullTimeEmp(String n,int d, int s){
		super(n,d);
		salary=s;
	}
	public FullTimeEmp(FullTimeEmp f){
		super(f);
		salary=f.salary;
	}
	public void display(){
		super.display();
		System.out.println("the Employee monthly salary is: "+salary);
	}
	public double calculatePay() {
		return (salary*0.09);
	}
	public int getSalary() {
		return salary;
	}

}
