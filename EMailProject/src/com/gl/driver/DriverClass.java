package com.gl.driver;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.println("---------------Main Menu------------");
		System.out.println("1.Technical Department");
		System.out.println("2.Admin Department");
		System.out.println("3.Human Resources Department");
		System.out.println("4.Legal Department");
		
		Employee employee1 = new Employee("Girish","Saxena");
		CredentialService cService = new CredentialService();
		int choice;
		
		System.out.println("Please Select your Option 1-4");
		choice = scan1.nextInt();
		
		if(choice == 1)
		{
			String generatedEMail;
			char[] generatedPswd;
			generatedEMail = cService.generateEMail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Tech");
			generatedPswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEMail, generatedPswd);
		}
		else if(choice == 2)
		{
			String generatedEMail;
			char[] generatedPswd;
			generatedEMail = cService.generateEMail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Admin");
			generatedPswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEMail, generatedPswd);
		}
		else if(choice == 3)
		{
			String generatedEMail;
			char[] generatedPswd;
			generatedEMail = cService.generateEMail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"HR");
			generatedPswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEMail, generatedPswd);
		}
		else if(choice == 4)
		{
			String generatedEMail;
			char[] generatedPswd;
			generatedEMail = cService.generateEMail(employee1.getFirstName().toLowerCase(),employee1.getLastName().toLowerCase(),"Legal");
			generatedPswd = cService.generatePassword();
			cService.displayCredentials(employee1, generatedEMail, generatedPswd);
		}
		else
		{
			System.out.println("Range is 1-4");
		}

	}

}
