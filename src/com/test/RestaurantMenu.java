//Scenario: A restaurant allows customers to select food items using a menu. 

package com.test;

public class RestaurantMenu {
	public static void main(String[] args) {
		int choice = 2;
		switch (choice) {

		case 1:
			System.out.println("Pizza - Rs. 250");
			break;

		case 2:
			System.out.println("Burger - Rs. 120");
			break;
		case 3:
			System.out.println("Sandwich - Rs. 100");
			break;
		case 4:
			System.out.println("Pasta - Rs. 180");
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
