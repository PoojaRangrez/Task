package com.xworkz.methods;

public class AtmOperation {
	public static void withdrawal(int password,int withdrawAmount) {
	    int pw=123;
	    int accBalance=50000;
	    int balance=accBalance-withdrawAmount;
	    if(pw==password && accBalance>withdrawAmount) {
	    	System.out.println("Valid Password");
	    	System.out.println("Balance Amount is " +balance);
	    }else {
	    	System.out.println("Invalidity");
	    }
	}


	public static void main(String[] args) {
		AtmOperation.withdrawal(123,9000);
	}

}
