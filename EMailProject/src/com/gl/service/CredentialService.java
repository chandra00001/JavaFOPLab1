package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {

	/*
	 * 1) generateEmail
2) generatePassword
3)displayDetails
	 */
	public char[] generatePassword()
	{
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		//ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)
		
		//mypass = Adhwy893
		String myData = capitalLetters + smallLetters + numbers + specialCharacters;
		// [x][y][2][][][][][]
		char[] password = new char[8];
		Random random = new Random();
		for(int i=0;i<8;i++)
		{
			password[i] = myData.charAt(random.nextInt(myData.length()));
		}
		
		return password;
	}
	// Harsha Gupta tech     --- harshagupta.tech@abc.com
	public String generateEMail(String firstName,String lastName,String department)
	{
		String generatedEMail;
		generatedEMail = firstName+lastName+"."+department+"@abc.com";
		return generatedEMail;
	}
	public void displayCredentials(Employee employee,String eMailGen,char[] genPsswd)
	{
		System.out.println("HI "+employee.getFirstName());
		System.out.println("Your email is "+eMailGen);
		System.out.println("Your Password is "+genPsswd);
	}
	
}
