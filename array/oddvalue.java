package com.xworkz.array;

public class oddvalue {

	public static void main(String[] args) {
		int values[]= {3094,9347,2092,1829,2939};
		System.out.println("The sum of all odd index number:");
		int sum=0;
		for(int i=0;i<values.length;i++)
			if(i%2!=0) {
				sum=sum+values[i];
			}
		System.out.println(sum);

	}

}
