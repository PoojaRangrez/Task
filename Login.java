package com.xworkz.methods;

public class Login {
	public static boolean loginToInstagram(String userName,String password) {
		String user="pooja";
		String pwd="123";
		if(user==userName && pwd==password) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Instagram");
		boolean validUser=Login.loginToInstagram("pooja","123");
		if(validUser==true) {
			System.out.println("Login successfully");
		}else {
			System.out.println("Invalid user");
		}

	}

}
