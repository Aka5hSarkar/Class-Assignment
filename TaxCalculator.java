/*Scenario: Developers need to develop a tax calculator for calculating tax using arithmetic, relational and logical operators.
Problem Statement 1: Declaring instance variables.
Develop a class “TaxCalculator” inside a package “com.cognizant.tax”. The class should have an instance float variable named “basicSalary” and a boolean variable  named “citizenship”.
Problem Statement 2: Usage of Arithmetic operators.
In the TaxCalculator class  create a method named  calculateTax()  that  should calculate and print the tax, the tax should  be calculated as follows
tax = 30*basic salary/100
NOTE: The value stored in the instance variable” basicSalary” should be used in the above calculation.
The calculated tax needs to be stored in another instance float variable “tax”.
This method will display the following message in the console.
“The Tax of the employee  for  the   <basic Salary> is <tax>”
Problem Statement 3: How to type cast?
In the TaxCalculator class  create a method named  deductTax() method this should reduce the tax calculated in problem statement 1 from  the basic salary and store it in a  instance int variable named  “nettSalary”.
NOTE:  Ensure to use casting for converting float to int.
This method will also display the following message in the console.
“The nett salary of the employee” <nettSalary>

Problem Statement 4: Usage of relational operator*/


package com.cognizant.tax;
import java.util.*;
//creating TaxCalculator class
class TaxCalculator {
//Problem Statement 1 : 
	
	//creating instance variable
	static float basicSalary,tax;
	static boolean citizenship;
	static int nettSalary;
//Problem Statement 2: 
	
	//creating method to calculate tax
	static void calculateTax() {
		tax=(30*basicSalary)/100;
		System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax);
	}
	
//Problem Statement 3: 
	//method to deduct salary
	static void deductTax() {
		nettSalary=(int) (basicSalary-tax);
		System.out.println("The nett salary of the employee : "+nettSalary);
	}
//Problem Statement 4: 
	
	//method to validate if the salary is > 1lakh and citizenship is true
	static void validateSalary() {
		boolean response=basicSalary>100000f && citizenship==true;
		if (response) {
			System.out.println("The salary and citizenship eligibility: "+response);
		}else {
			System.out.println("The salary and citizenship eligibility: "+response);
		}
	}
}
//Problem Statement 5:

//creating a EmployeeTax class in the same package
class EmployeeTax{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//taking inputs
		System.out.println("Enter basic salary : ");
		TaxCalculator.basicSalary=sc.nextFloat();
		System.out.println("Enter citizenship (true if inside India otherwise false)");
		TaxCalculator.citizenship=sc.nextBoolean();
		sc.close();
		//calling the methods
		TaxCalculator .calculateTax();
		TaxCalculator.deductTax();
		TaxCalculator.validateSalary();
	}

}
