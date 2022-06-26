package com.gl.model;

// ctrl++ to increase font windows
// cmd++ for mac 
// ctrl+s save 
// Object   java.lang
/*
 * class Object
 * {
 * 		public Object()
 * 		{
 * 
 * 		}
 * 
 * 
 * 
 * }
 * 
 * 
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/*public static void main(String[] args)
	{
		Employee suresh = new Employee();
	}*/

}
