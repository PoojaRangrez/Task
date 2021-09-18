package com.xworkz.methods;

public class ATMOperator {
	public static void checkBalance(String atmCard,String atmPin) {
		String aC="Athorized ATM Card";
		String pin="1010";
		if(aC==atmCard && pin==atmPin) {
			System.out.println("Card swiped successfully" );
			System.out.println("Valid Pin");
			System.out.println("Balance Amount is:50000" );
		}else {
			System.out.println("Invalid");
		}
	}
	

	public static void main(String[] args) {
		System.out.println("On Screen:Insert your ATM card into the ATM Will display,then following operations takes place:");		
		ATMOperator.checkBalance("Athorized ATM Card","1010");
		System.out.println("Log out from your account");
		
				
		
		
		
		
		

	}

}
