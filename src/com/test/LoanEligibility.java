/*  Scenario: A bank approves a loan when: 
• Applicant age is at least 21 years. 
• Monthly salary is at least 25,000. 
• Credit score is at least 700.   */

package com.test;

public class LoanEligibility {
	public static void main(String[] args) {
		int age = 25;
		int salary = 35000;
		int creditScore = 750;
		if (age >= 21) {
			if (salary >= 25000) {
				if (creditScore >= 700) {
					System.out.println("Loan Approved");
				} else {
					System.out.println("Low Credit Score");
				}
			} else {
				System.out.println("Salary Not Eligible");
			}
		} else {
			System.out.println("Age Not Eligible");
		}
	}
}
