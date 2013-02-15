/*
 * File: Add2Integers.java
 * -----------------------
 * A simple ConsoleProgram to add two integers
 * and display their total.
 */

import acm.program.*;

public class Add2Integers extends ConsoleProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
		/* So all y'all in the back can see! */
		setFont("DejaVuSerif-BOLD-10");

		println("This program adds two numbers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int total = n1 + n2;
		println("The total is " + total + ".");
		
	}

}

