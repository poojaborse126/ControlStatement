package com.test;

public class ElectricityBill {
	public static void main(String[] args) {
		int units = 150;
		int bill;
		if (units <= 100) {
			bill = units * 5;
		} else if (units <= 200) {
			bill = units * 7;
		} else {
			bill = units * 10;
		}
		System.out.println("Electricity Bill: " + bill);
	}
}
