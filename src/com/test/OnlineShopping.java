/* Scenario: An order can be placed only when the product is available and the 
customer has sufficient balance. */
package com.test;

public class OnlineShopping {
	public static void main(String[] args) {
		boolean productAvailable = true;
		int balance = 5000;
		int productPrice = 3500;
		if (productAvailable) {
			if (balance >= productPrice) {
				System.out.println("Order Placed Successfully");
			} else {
				System.out.println("Insufficient Balance");
			}
		} else {
			System.out.println("Product Out of Stock");
		}
	}
}
