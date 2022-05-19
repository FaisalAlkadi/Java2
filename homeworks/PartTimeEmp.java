package fapplication;

public class PartTimeEmp extends Employee {
	private int nbWorkHours;
	private int rate;
	public PartTimeEmp(String n, int d, int nb,int r){
		super(n,d);
		nbWorkHours=nb;
		rate=r;
	}
	public PartTimeEmp(PartTimeEmp p){
		super(p);
		nbWorkHours=p.nbWorkHours;
		rate=p.rate;
	}
	public void display(){
		super.display();
		System.out.println("the nnumber of weekly hours the employee works is: "+nbWorkHours);
		System.out.println("pay rate for each hour is: "+rate);
	}
	
	public double calculatePay() {
		return nbWorkHours*4*rate;
	}
	public int getNbWorkHours() {
		return nbWorkHours;
	}
	public int getRate() {
		return rate;
	}
	
	

}
