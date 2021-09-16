package com.xworkz.methods;

public class Fan {
	public static void increaseSpeed() {
		System.out.println("Fan Speed is increased successfully ");
	}
	public static void decreaseSpeed() {
		System.out.println("Fan Speed is decreased successfully");
	}
	public static void switchOn() {
		System.out.println("Switching on the fan reverses the direction of the fan ");
	}
	public static void switchOff() {
		System.out.println("Fan is sucessfully switched off");
	}
	public static void main(String[] args) {
		Fan.increaseSpeed();
		Fan.decreaseSpeed();
		switchOn();
		switchOff();
	}

}

