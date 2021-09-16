package com.xworkz.array;

public class indexOfEvenNumSum {

	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,6,7};
		System.out.println("Sum of all even no. index:");
		int sum=0;
		for(int i=0;i<numbers.length;i++)
			if(i%2==0) {
				sum=sum+numbers[i];
			}
		    System.out.println(sum);	
	}	
}
