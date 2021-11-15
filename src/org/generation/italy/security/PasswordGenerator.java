package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String fName = "Gino";
		String lName = "Paoli";
		String favouriteColor = "porpora";
		
		int day = 27;
		int month = 07;
		int year = 1964;
		int sum = day + month + year;
		
		System.out.println("Password generata: " + fName + "-" + lName + "-" + favouriteColor + "-" + sum );

	}

}
