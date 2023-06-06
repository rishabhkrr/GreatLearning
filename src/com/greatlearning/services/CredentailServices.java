/**
 * 
 */
package com.greatlearning.services;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import java.util.Random;
/**
 * @author rajat
 *
 */


public class CredentailServices implements ICredentials {
	@Override
	public String generateEmailAddress(Employee employee, String department) {
		return employee.getFirstName()+employee.getLastName()+"@"+department+"."+"greatlearning.in";
	}
	private static final int PASSWORD_LENGTH = 8;
	
	@Override
	public String generatePassword() {
		String password = "";
		Random random = new Random();
		String upperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerChar = "abcdefghijklmnopqursyuvwxyz";
		String number = "0123456789";
		String specialChars = "!@#$%^&*()_-+=[]{}\\|/:;'\",<.>?";
		String allChars = upperChar + lowerChar + number + specialChars;
		
		for(int i = 0; i < PASSWORD_LENGTH; i++) {
			int randIndex = random.nextInt(allChars.length());
			password +=allChars.charAt(randIndex);
		}
//		System.out.println("random genrated password is : "+ password);
		return password;
	}
	
	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Name : "+ employee.getFirstName()+""+employee.getLastName());
		System.out.println("Department : "+ employee.getDepartment());
		System.out.println("Email : " +employee.getEmail());
		System.out.println("Password :"+ employee.getPassword());
	}
}
