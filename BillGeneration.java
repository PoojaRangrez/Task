package com.xworkz.methods;

public class BillGeneration {
	public static void billGenerator(int price,int quantity) {
		int total=price*quantity;
		System.out.println(total);
	}

	public static void main(String[] args) {
		BillGeneration.billGenerator(23,4);

	}

}
