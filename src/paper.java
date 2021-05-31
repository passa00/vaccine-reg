import java.util.*;
import java.lang.*;



class Patient{
	private int n[][];
	private int number[];
	
	Patient(int arr[][]){
		n = arr;
		number = new int[arr.length];
	}
	
	
	private void calculateIndex(){
		for(int i=0;i<n.length;i++){
			number[i] = rratory(n[i][0])+pulse(n[i][1])+fRate(n[i][2]);
		}
	}
	
	private int rratory(int x){
		if(x<=22) return 0;
		else if(x<=28 && x>=23) return 1;
		else return 2;
	}
	
	private int pulse(int y){
		if(y>92) return 0;
		else if(y>=89 && y<=92) return 2;
		else return 5;
	}
	
	private int fRate(int z){
		if(z<=2) return 0;
		else if(z>=3 && z<=4) return 4;
		else if(z>=5 && z<=6) return 5;
		else return -1;
	}
	
	
	
	void show(){
		calculateIndex();
		System.out.println("QCSI index =>");
		for(int i=0;i<number.length;i++){
			System.out.println("Patient "+(i+1)+": "+number[i]);
			
			if(number[i]<=5)
			{
				System.out.println(" risk-level is Low");
				}
			if(number[i]>5 && number[i]<=9)
			{
				System.out.println(" risk-level is Moderate");
				}
				
			
			if(number[i]>9)
			{
				System.out.println(" risk-level is high");
				}
		}
	}
}


public class paper{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int arr[][],n;
		System.out.println("How many petent data u have :- ");
		n = sc.nextInt();
		arr= new int[n][3];
		
		for(int i=0;i<n;i++){
			System.out.println("\nenter patient "+(i+1)+" details =>");
			System.out.print("Respiratory rate :");
			arr[i][0] = sc.nextInt();
			System.out.print(" Pulse rate :");
			arr[i][1] = sc.nextInt();
			System.out.print("O2 Flow rate :");
			arr[i][2] = sc.nextInt();
		}
		
		Patient data = new Patient(arr);
		data.show();
	}
	
}