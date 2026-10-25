/*Scenario: A user can log in only when both the username and password are 
correct. */

package com.test;

public class LoginSystem {

	public static void main(String[] args) {
		String username = "admin";
		String password = "admin123";
		if (username.equals("admin")) {
			if (password.equals("admin123")) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Incorrect Password");
			}
		} else {
			System.out.println("Invalid Username");
		}
	}
}
