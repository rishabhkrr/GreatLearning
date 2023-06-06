/**
 * 
 */
package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentailServices;
/**
 * @author rajat
 *
 */
public class Driver {
	
	public static void displayMenu(){
		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}
	
//	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		
		
		System.out.println("Enter Employee First Name: ");
		Scanner scString = new Scanner(System.in);
		String firstName = scString.nextLine();
		System.out.println("Enter Employee Last Name: ");
		Scanner scString1 = new Scanner(System.in);
		String lastName = scString1.nextLine();
		
		Employee employee = new Employee(firstName, lastName);
		
		displayMenu();
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		String [] departmentMap = {"tech", "admin", "hr", "legal"};
		String selectdepartment = departmentMap[ch - 1];
//		
		

//		int option = sc.nextInt();
		System.out.println(ch);
		
		CredentailServices credentialService = new CredentailServices();
		String emailAddress = credentialService.generateEmailAddress(employee, selectdepartment);
		String password = credentialService.generatePassword();
//		CredentailServices credentialservice = new CredentailServices();
		employee.setDepartment(selectdepartment);
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		credentialService.showCredentials(employee);
		
//		String emailAddress = credentialService.generateEmailAddress(employee, selectdepartment);
//		System.out.println(details);
	}
//	
}
