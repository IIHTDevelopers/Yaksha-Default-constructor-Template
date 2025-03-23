package com.yaksha.assignment;

class Person {
	// Default constructor: This constructor is automatically provided by Java if no
	// constructor is defined.
	String name;

	public Person() {
		name = "John Doe"; // Initializing the name with a default value
	}
}

public class DefaultConstructorAssignment {
	public static void main(String[] args) {
		// Task 2: Use Default Constructor in the Main Method

		Person person = new Person(); // Creating an object of Person using the default constructor
		System.out.println("Person's name: " + person.name); // Printing the default name
	}
}
