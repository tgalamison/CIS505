/* 
	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.

	Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
		https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s
	
	Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
		https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045
*/

package cis505;
//Imports required classes for user input.
import java.util.Scanner;
//Declare TestCustomerAccountApp class.
public class TestCustomerAccountApp {

	public static void main(String[] args) {
		//Scanner object that reads user input.
		Scanner sc = new Scanner(System.in);
		int customerNumber;
		String choice;
		//Prompts user to enter a customer number.
		System.out.print("Enter a customer number between 1007 and 1009");
		customerNumber = sc.nextInt();
		//Gets the customer information from the entered customer number.
		Customer customer = CustomerDB.getCustomer(customerNumber);
		//Creates a new account for the customer.
		Account account = new Account();
		//Repeats the menu selection until user exits. 
		do {
			//Displays account menu options. 
			account.displayMenu();
			System.out.print("Enter your choice");
			char userChoice = sc.next().toLowerCase().charAt(0);
			//Performs the user selected operation.
			switch (userChoice) {
				case 'b':
					System.out.printf("Current balance:)	$%,6.2f%n", account.getBalance());
					break;
				case 'd':
					System.out.print("Enter deposit amount: ");
					double depositAmount = sc.nextDouble();
					account.deposit(depositAmount);
					System.out.println("Deposit Successful!");
					break;
				case 'w':
					System.out.print("Enter withdraw amount: ");
					double withdrawalAmount = sc.nextDouble();
					if (withdrawalAmount <= account.getBalance()) {
						account.withdraw(withdrawalAmount);
						System.out.println("Withdraw Successful!");
					} else {
						System.out.println("Error: Insufficient Balance!");
					}
					break;
				case 'x': 
					break;
					default:
						System.out.println("Error: Invalid Option");
				}
			//Prompts user to continue or exit. 
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			
		} while (choice.equalsIgnoreCase("y"));
		
		System.out.println("\nCustomer Details:");
		System.out.println(customer.toString());
		System.out.printf("Account Balance: $%,6.2f%n", account.getBalance());
		//closes the scanner object.
		sc.close();
		
	}

}


