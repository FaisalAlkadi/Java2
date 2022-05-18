package fapplication;

import java.util.Scanner; 

public class ArrayRecursor {
	
	public static int fill( int array [],Scanner s) {
		return fill(array,s,0);
	}
	private static int fill(int array[],Scanner s,int start ) {
		System.out.print("Enter number: ");
		int sc=s.nextInt();
		if(start<10 && sc!=-1) {
			
			array[start]=sc;
			 return fill(array,s,start+1);
		}
		System.out.println("You entered "+start+" numbers.");
		return start;
	}
	public static int cont(int array[]){
		return cont(array,0);
	}
	private static int cont(int array[],int start){
		if (start < 10 && array[start]!=-1)
			return cont(array,start+1);
		System.out.println("the array is of size "+start);
		return start;
	}
	public static int sum(int array[]) {
		return sum(array,0);
	}
	private static int sum(int array[],int start) {
		if(start<10 && array[start]!=-1)
			return array[start]+sum(array,start+1);
			return 0;
	}
	public static void printArray( int array []) {
		if(array[0]==-1) {
			System.out.println("There is no array");
			return;
		}
			
		System.out.print("The array is : [");
		printArray(array,0);
		System.out.println("]");
	}
	private static void printArray(int array[],int start ) {
		if(start<10 && array[start]!=-1) {
			System.out.print(array[start]);
		if(start+1<10 && array[start+1]!=-1)
			System.out.print(",");
		printArray(array,start+1);
		}
	}
	public static void printReverse( int array []) {
		if(array[0]==-1) {
			System.out.println("There is no array");
			return;
		}
			
		System.out.print("The array in reverse order is ");
		System.out.print("[");
		printReverse(array,9);
		System.out.print(array[0]);
		System.out.println("]");
	}
	private static void printReverse(int array[],int start ) {
		if(start-1<0)
			return;
		if(array[start]!=-1) {
			System.out.print(array[start]);
			System.out.print(",");
		
		}
		printReverse(array,start-1);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=-1;
		ArrayRecursor ar=new ArrayRecursor();
		int num;
		do {
		System.out.println("1) Fill new array .");
		System.out.println("2) Count elements .");
		System.out.println("3) Calculate sum of elements .");
		System.out.println("4) Print the array .");
		System.out.println("5) Print the array in reverse order.");
		System.out.println("6) Quit");
		System.out.print("Enter a choice :");
		 num=s.nextInt();
		switch (num) {
		case 1:
			ar.fill(arr,s);
			break;
		case 2:
			ar.cont(arr);
			break;
		case 3:
			System.out.println("The array has sum of "+ar.sum(arr));
			
			break;
		case 4:
			ar.printArray(arr);
			
			break;
		case 5:
			ar.printReverse(arr);
			
			break;
		}
		
		
		}while(num != 6);
	}
	}
