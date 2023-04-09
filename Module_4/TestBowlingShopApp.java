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
// TestBowlingShopApp class.

public class TestBowlingShopApp {
	// Main method for the program.
	public static void main(String[] args) {
		// Scanner object that reads user input.
		Scanner input = new Scanner(System.in);
		// Stores the user's input as a String.
		String choice;
		// If choice is not x, run the loop. 
		
		do {
			// Displays menu options to the user.
			displayMenu();
			// Read's user's inputs and trims empty space.
			choice = input.next().trim();
			// If user's choice is not x, run the following.
			if (!choice.equalsIgnoreCase("x")) {
				// Calls getProducts with users choice and stores the return in products. 
				GenericQueue<Product> products =
				ProductDB.getProducts(choice);
				// Runs the loop as long as there are products in the queue.
				while (products.size() > 0) {
					// Dequeue's and prints the next product in queue.
					System.out.println(products.dequeue());
					// Prints a blank line.
					System.out.println("--------------");
				}
			}
		// Run's the loop until user chooses x.
		} while (!choice.equalsIgnoreCase("x"));
		// Prints "End of line" message when user exits.
		System.out.println("\nEnd of line...");
		// Closes Scanner Object.
		input.close();
	}
	// Public static method that displays menu options to the user. 
	public static void displayMenu() {
		System.out.println("MENU OPTIIONS");
		System.out.println("1. <b> Bowling Balls");
		System.out.println("2. <a> Bowling Bags");
		System.out.println("3. <s> Bowling Shoes");
		System.out.println("4. <x> To exit");
		System.out.print("\nPlease choose an option: ");

	}

}
