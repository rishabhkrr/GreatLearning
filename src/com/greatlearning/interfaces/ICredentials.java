/**
 * 
 */
package com.greatlearning.interfaces;

import com.greatlearning.model.Employee;

/**
 * @author rajat
 *
 */
public interface ICredentials {
	public String generateEmailAddress(Employee employee, String department);
	public String generatePassword();
	public void showCredentials(Employee employee);
//	void showCredentials(Employee employee, );

}
