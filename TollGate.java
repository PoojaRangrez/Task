package com.xworkz.methods;

public class TollGate {
	public static void amount(String vehicle) {
		if(vehicle=="bike") {
			System.out.println("Amount is 20");
		}else if(vehicle=="car") {
			System.out.println("Amount is 50");
		}else if(vehicle=="PBus") {
			System.out.println("Amount is 100");
		}else {
			System.out.println("free");
		}
	}

	public static void main(String[] args) {
		TollGate.amount("PBus");

	}

}
