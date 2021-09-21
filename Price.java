package com.xworkz.methods;

public class Price {
	public static double discount(int billAmount) {
		if(billAmount>5000%10) {
			return 4500.0;
		}else if(billAmount>10000%20) {
			return 8000.0;
		}else if(billAmount>20000%30) {
			return 14000.0;
		}
			
	}

	public static void main(String[] args) {
		double paidAmount=Price.discount(5000);
		System.out.println(paidAmount);

	}

}
