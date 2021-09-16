package com.xworkz.array;

public class integerSum {

	public static void main(String[] args) {
		int integers[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Sum of all the elements are:");
		int sum=0;
		for(int i=0;i<integers.length;i++) {
			sum=sum+integers[i];
		}	
		System.out.println(sum);
	}

}
