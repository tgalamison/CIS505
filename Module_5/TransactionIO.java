/*
		Alex Lee. (2018, December 14). Java: Read Text File Easily [Video]. YouTube.
			https://www.youtube.com/watch?v=lHFlAYaNfdo
		
		Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
			https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s	
			
		Coding with John. (2021, April 26). Java File Input/Output - It's Way Easier Than You Think. [Video]. YouTube.
			https://www.youtube.com/watch?v=ScUJx4aWRi0
		
		Kindson The Tech Pro. (2019, January 20). Regular Expressions Made Easy with Java - 2019 Tutorials. [Video]. YouTube.
			https://www.youtube.com/watch?v=sCuOJ8uadOg
		
		Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
		Modified by Terrence Galamison 2023. 
		
		Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
			https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045
*/

package cis505;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TransactionIO {
	// Constants for the file name and creates a File object.
	private static final String FILE_NAME = "expenses.txt" ;
    private static File file = new File(FILE_NAME);
    // Method that inserts multiple transactions into the expenses file.
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        // PrintWriter object for file output. 
    	PrintWriter output = null;
        // Checks if the file exists and opens it. If it does not exist, creates a new file.
    	if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }
        // Writes each transaction to the file. 
    	for (Transaction transaction : transactions) {
            output.println(transaction.toString());
        }
        // Closes PrintWriter.
    	output.close();
    }
    // Method that reads all transactions from the expenses file.
    public static ArrayList<Transaction> findAll() throws FileNotFoundException {
        // Creates a new File object for the txt file. 
    	File file = new File(FILE_NAME);
        // Creates Scanner object to read the file. 
    	Scanner input = new Scanner(file);
        // Creates ArrayList that stores transactions.
    	ArrayList<Transaction> transactions = new ArrayList<>();
        // Defines regex patterns for date, description and amount.
        Pattern datePattern = Pattern.compile("Date: (.+)");
        Pattern descPattern = Pattern.compile("Description: (.+)");
        Pattern amountPattern = Pattern.compile("Amount: \\$(.+)");
        // Loops through the file to get transaction details using regex patterns. I experimented with different ways of getting the information from the file. Pattern & Matcher seemed to worked nicely.
        while (input.hasNext()) {
            String dateLine = input.nextLine();
            Matcher dateMatcher = datePattern.matcher(dateLine);
            if (dateMatcher.find()) {
                String date = dateMatcher.group(1);
                String descLine = input.nextLine();
                Matcher descMatcher = descPattern.matcher(descLine);
                if (descMatcher.find()) {
                    String description = descMatcher.group(1);
                    String amountLine = input.nextLine();
                    Matcher amountMatcher = amountPattern.matcher(amountLine);
                    if (amountMatcher.find()) {
                        double amount = Double.parseDouble(amountMatcher.group(1));
                        // Adds the transaction to the ArrayList.
                        transactions.add(new Transaction(date, description, amount));
                    }
                }
            }
        }
        // Closes Scanner.
        input.close();
        // Returns list of transactions. 
        return transactions;
    }
}

