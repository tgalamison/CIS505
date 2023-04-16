/*
		Alex Lee. (2018, December 14). Java: Read Text File Easily [Video]. YouTube.
			https://www.youtube.com/watch?v=lHFlAYaNfdo
		
		Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
			https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s	
			
		Coding with John. (2021, April 26). Java File Input/Output - It's Way Easier Than You Think. [Video]. YouTube.
			https://www.youtube.com/watch?v=ScUJx4aWRi0
		
		Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
		Modified by Terrence Galamison 2023. 
		
		Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
			https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045
*/

package cis505;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

	public static void main(String[] args) throws IOException {
        // Scanner for user input and an ArrayList to store data.
		Scanner sc = new Scanner(System.in);
        ArrayList<Transaction> transactions = new ArrayList<>();
        // Control variable for the main loop.
        boolean keepRunning = true;
        // Keeps main loop running until the user exits.
        while (keepRunning) {
            System.out.println("Welcome to the Expense Tracker\nMENU OPTIONS\n1. View Transactions\n2. Add Transactions\n3. View Expense\nPlease choose an option:");
            // Reads the users choice.
            int choice = ValidatorIO.getInt(sc, "");
            // Processes the users choice. 
            
            switch (choice) {
                case 1:
                    // Reads transactions and prints them.
                	transactions = TransactionIO.findAll();
                    for (Transaction transaction : transactions) {
                        System.out.println(transaction.toString() + "\n");
                    }
                    break;
                case 2:
                    // Adds a new transaction.
                	boolean addMore = true;
                    // Keeps adding transactions until the user stops. 
                	while (addMore) {
                    	// Reads details from the user.
                		String date = ValidatorIO.getString(sc, "Enter the date (MM-dd-yyyy): ");
                    	String description = ValidatorIO.getString(sc, "Enter the description: ");
                        double amount = ValidatorIO.getDouble(sc, "Enter the amount: ");
                        // Adds the transaction to the ArrayList.
                        transactions.add(new Transaction(date, description, amount));
                        // Asks the user if they want to add another transaction.
                        System.out.print("Add another transaction? (y/n): ");
                        String response = sc.next();
                        // If the user enters 'no', stops adding transactions.
                        if (response.equalsIgnoreCase("n")) {
                            addMore = false;
                        }
                    }
                    // Saves the transaction to the file.
                	TransactionIO.bulkInsert(transactions);
                    break;
                case 3:
                    // Calculates and displays the total expense.
                	transactions = TransactionIO.findAll();
                    double totalExpense = 0;
                    for (Transaction transaction : transactions) {
                        totalExpense += transaction.getAmount();
                    }
                    // Prints total monthly expense.
                    System.out.printf("Your total monthly expense is $%.2f%n", totalExpense);
                    break;
                default:
                    // Prints invalid menu option.
                	System.out.println("Invalid option.");
                    break;
            }
            // Question to user to continue.
            System.out.print("Continue? (y/n): ");
            String continueResponse = sc.next();
            // If no is selected, exit the loop. 
            if (continueResponse.equalsIgnoreCase("n")) {
                keepRunning = false;
                System.out.println("Program terminated by the user…");
            }
        }
        // Close the Scanner. 
        sc.close();
    }
}
