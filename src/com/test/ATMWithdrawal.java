package com.test;

public class ATMWithdrawal {

	public static void main(String[] args) {
		int balance = 10000;
		int withdraw = 12000;
		if (withdraw <= balance) {
			System.out.println("Withdrawal Successful");
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}
