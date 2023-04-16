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

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	// Private data field for the date of the transaction.
	private String date;
    // Private data field for the description.
	private String description;
    // Private data field for the amount. 
	private double amount;
    // Constructor that creates a default Transaction object & sets default values for date, description and amount.
    public Transaction() {
        this.date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        this.description = "";
        this.amount = 0;
    }
    // Constructor that creates a transaction with the data fields. 
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }
    // Accessor method for the date field. 
    public String getDate() {
        return date;
    }
    // Mutator method for the date field. 
    public void setDate(String date) {
        this.date = date;
    }
    // Accessor method for the description field.
    public String getDescription() {
        return description;
    }
    // Mutator method for the description field.
    public void setDescription(String description) {
        this.description = description;
    }
    // Accessor method for the amount field.
    public double getAmount() {
        return amount;
    }
    // Mutator method for the amount field. 
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Overrides the toString and returns a description of the transaction. 
    public String toString() {
        return "Date: " + date + "\nDescription: " + description + "\nAmount: $" + String.format("%.2f", amount);
    }
}
