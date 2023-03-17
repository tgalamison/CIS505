/* 
	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.
*/

package cis505;

public class GalamisonHelloWorld {

	public static void main(String[] args) {

		String firstName = "Terrence"; //Creates a new String type variable called 'firstName' and assigns the value "Terrence" to it.
        String lastName = "Galamison"; //Creates a new String type variable called 'lastName' and assigns the value "Galamison" to it.
        System.out.printf("Hello World from %s %s.", firstName, lastName); //'System.out.printf' is a Method used to print the formatted string when ran and the '%s' characters are used as place holders for the 'firstName' & 'lastName' variables. When the program is ran, the expected output is "Hello World from Terrence Galamison". 
	}// End GalamisonHelloWorld

}// End Main
