package com.xworkz.methods;

public class Phonepay {
	public static void recharge(String mobileNum,String operatorName,String amount) {
		System.out.println("Enter the Mobile Number:"+mobileNum);
		System.out.println("Select the Operator Name:"+operatorName);
		System.out.println("Enter the recharge amount:"+amount);
		}
	
	public static void electricityBill(String uniqueCustomerIdentityNum,String electricityBoard,String upiCardNum) {
		System.out.println("Enter the Unique Customer id on 'Eelctricity' under the 'Recharge and Pay Bills'section:"+uniqueCustomerIdentityNum);
		System.out.println("Select your Electricity board:"+electricityBoard);
		System.out.println("'Pay your bill with bill details using upi card', UPI Card Number:"+upiCardNum);
	}
	
	public static void waterBill(String state,String provider,String consumerNum) {
		System.out.println("Select sate:"+state);
		System.out.println("Select Provider:"+provider);
		System.out.println("Consumer Number:"+consumerNum);
	}
	
	public static void dthRecharge(String provider ,String subscriberId,String amount) {
		System.out.println("Select Provider:"+provider);
		System.out.println("Subscriber ID:"+subscriberId);
		System.out.println("Enter Amount:"+amount);
	}
	
	public static void moneyTransfer(String mobNum,String money,String bankAcc) {
		System.out.println("Enetr Mobile Number:"+mobNum);
		System.out.println("Enter Amount:"+money);
		System.out.println("Choose Bank Account:"+bankAcc);
	}


	

	

	public static void main(String[] args) {
		System.out.println("Recharge for a friend");
		Phonepay.recharge("9844995019","Jio","2200");
		
		System.out.println("Pay Electric Bill");
		Phonepay.electricityBill("23576281","KEB","5674 939 787");
		
		System.out.println("Pay water Bill");
		Phonepay.waterBill("Karnataka","Karnatka Urban Water Supply","1284787994");
		
		System.out.println("DTH Recharge");
		Phonepay.dthRecharge("Tata Sky","726846934","200");
		
		System.out.println("Send Money using mobile number");
		Phonepay.moneyTransfer("9880165056","220000","xxxxxxxxxx23");

	}

}
