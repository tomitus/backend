package com.example.viikko2.domain;

public class Student {
	private String name;
	private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public String[] split(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
