package fapplication;

import java.util.Scanner;

public class Company {
	private String name;
	private Employee[] arrEmployee;
	private int nbEmployee;
	public Company(String n,int size)throws NegativeArraySizeException{
		name=n;
		if(size<=0)
		throw new NegativeArraySizeException("NegativeArraySizeException");
		arrEmployee=new Employee[size];
		nbEmployee=0;
		
	}
	public void displayAll(){
		System.out.println("the company name is:"+name);
		for(int i=0;i<nbEmployee;i++)
			arrEmployee[i].display();
	}
	public void addEmployee(Employee e)throws IllegalStateException{
		if(nbEmployee==arrEmployee.length)
			throw new IllegalStateException("full array");
		if(e instanceof PartTimeEmp)
			arrEmployee[nbEmployee++]=new PartTimeEmp((PartTimeEmp)e);
		else
			arrEmployee[nbEmployee++]=new FullTimeEmp((FullTimeEmp)e);
	}
	public int searchName(String n){
		for(int i=0;i<nbEmployee;i++)
			if(arrEmployee[i].getName().equals(n))
				return i;
		return-1;
	}
	public void deleteEmployee(String n)throws IndexOutOfBoundsException{
		int index=searchName(n);
		if(index==-1)
			throw new IndexOutOfBoundsException("non-existent");
		for(int i=index;i<nbEmployee-1;i++)
			arrEmployee[i]=arrEmployee[i+1];
		nbEmployee--;
			}
	public double getYearpay(String name) {
		//لم يكتب الشرح على هذه الميثود في البلاك بورد
		return 0;
	}
	public double calAvgPayForPartTime()throws ArithmeticException {
		double avr=0;
		int cont=0;
	for(int i=0;i<nbEmployee;i++) {
		if (arrEmployee[i] instanceof PartTimeEmp) {
		avr +=arrEmployee[i].calculatePay();
		cont++;
	}
	}
	if(cont==0)
		throw new ArithmeticException("there’re not any part-time employees");
	return avr/cont;
	}
	public static void main(String[] args) {
		Employee f= new FullTimeEmp("ali",436,7000);
		Employee p= new PartTimeEmp("faisal",437,17,4);
		Employee p2= new PartTimeEmp("khalid",436,25,2);
		f.display();
		System.out.println("the calculatePay for FullTimeEmp: "+f.calculatePay());
		p.display();
		System.out.println("the calculatePay for PartTimeEmp: "+p.calculatePay());
		try {
		Company c= new Company("STC",3);
		c.displayAll();
		c.addEmployee(f);
		c.addEmployee(p);
		c.addEmployee(p2);
		c.deleteEmployee(f.getName());
		c.deleteEmployee("faisal");
		c.calAvgPayForPartTime();
		}catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException");
		}catch (IllegalStateException e) {
			System.out.println("full array");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("non-existent");
		}catch (ArithmeticException e) {
			System.out.println("there’re not any part-time employees");
		}
		
	}

}
