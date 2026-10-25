//Scenario: A company provides bonuses based on employee experience. 
//• 10 years or more: 20% 
//• 5–9 years: 10% 
//• 2–4 years: 5% 
//• Less than 2 years: No bonus 
package com.test;

public class EmployeeBonus {
	public static void main(String[] args) {
		int experience = 6;
		double salary = 30000;
		double bonus;
		if (experience >= 10) {
			bonus = salary * 0.20;
		} else if (experience >= 5) {
			bonus = salary * 0.10;
		} else if (experience >= 2) {
			bonus = salary * 0.05;
		} else {
			bonus = 0;
		}
		System.out.println("Bonus: " + bonus);
	}
}
