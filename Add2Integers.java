/*
 * File: Add2Integers.java
 * -----------------------
 * A simple ConsoleProgram to add two integers
 * and display their total.
 */

import acm.program.*;

public class Add2Integers extends ConsoleProgram {

	public void run() {
		/* So all y'all in the back can see! */
		setFont("DejaVuSerif-BOLD-10");

		/*println("This program adds two numbers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int total = n1 + n2;
		println("The total is " + total + ".");*/
		
		println("This program converts fahrenheit to celsius");
		//int fahrenheit = 45;
		int celsius = (45 - 32) * (5 / 9);
		println("Celsius is - " + celsius + " degree");
	}

}

