/*
		Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
			https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s	
			
		Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
		Modified by Terrence Galamison 2023. 
		
		Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
			https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045
*/

package cis505;

import java.util.Scanner;

public class ValidatorIO {
	// Static method that gets an integer value from the users input.
	public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;
        // Loop until valid input is entered. 
        while (!isValid) {
            System.out.print(prompt);
            // Checks if input is an integer.
            if ((sc.hasNextInt())) {
                input = sc.nextInt();
                isValid = true;
            } else {
                // Prints error message if invalid entry is input.
            	System.out.println("Error! Invalid integer value.");
            }
            sc.nextLine();
        }
        
        return input;
    }
	// Static method that gets double value from user input.
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                // Prints error message if invalid entry is input.
            	System.out.println("Error! Invalid double value.");
            }
            sc.nextLine();
        }
        return input;
    }
    // Public static method that gets string value from user. 
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.next();
    }
}
