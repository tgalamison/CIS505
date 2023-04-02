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
//Imports classes for date and time.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Declare the Account class.
public class Account {
	//Private data field that sets the default balance to 200.
	private double balance = 200;
	//Accessor method for the balance data field.
	public double getBalance() {
		return balance;
			}
	//Public method that deposits an amount to the account and updates the balance.
	public void deposit(double amt) {
		balance += amt;
	}
	//Public method that withdraws an amount if there is enough money there. 
	public void withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
		}
		
	}
	//Public method that displays the account menu to the user.
	public void displayMenu() {
		System.out.println("Account menu");
		System.out.println("Enter <D/d> for deposit");
		System.out.println("Enter <W/w> for withdraw");
		System.out.println("Enter <B/b> for balance");
			System.out.println("Enter option>:");
	}
	//Public method that gets the current transaction date.
	public String getTransactionDate() {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		return currentDate.format(formatter);
	}

}


