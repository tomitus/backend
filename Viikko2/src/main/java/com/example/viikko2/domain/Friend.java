package com.example.viikko2.domain;

public class Friend {
	
	
	private String name;
	private String firstName;
    private String lastName;
  
    public Friend(String firstName, String lastName) {
    	super();
		this.firstName = firstName;
		this.lastName = lastName;
    }
    @Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	
	

}
