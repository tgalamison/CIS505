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
//Imports the scanner class for user input. 
import java.util.Scanner; 
//Defines the TestSportsTeamApp class.
public class TestSportsTeamApp {
    //Entry point for the main method of the program.
	public static void main(String[] args) {
	//Creates a scanner object that reads the user's input. 
		Scanner input = new Scanner(System.in);
	//Store's the users decision to continue or end the program. 
		String decision;
	{
	//Prompts the user to enter the team name.
	System.out.print("Enter the team name: ");
		String teamName = input.nextLine();
	//Prompts the user to enter player names separated by commas and without spaces.
	System.out.print("Enter player names separated by commas without spaces: ");
		String playerNames = input.nextLine().replaceAll("(,)+$", "");
	//Creates a new instance of the team class with the users chosen team name. 
	Team team = new Team(teamName);
	//Split method that converts a user's player string into a string array of players. 
		String[] players = playerNames.split(",");
	//This for loop iterates over the String array of players and invokes the addPlayer method.
	for (String player : players) {
		team.addPlayer(player);
	}
	//Prints the "hint" message after execution. 
	System.out.println(" hint: use commas for multiple players; no spaces>: steve,john");
	//Prints a blank line.
	System.out.println();
	//Prints the "Team Summary" message after execution. 
	System.out.println(" --Team Summary-- ");
	//Prints the number of players that on the team.
	System.out.printf(" Number of players in team %d%n", team.getPlayerCount());
	//Prints the players name or names that are on the team.
	System.out.print(" Players on team: "); 
	for (int i = 0; i < team.getPlayerCount(); i++) {
		System.out.print(team.getPlayers()[i] + (i != team.getPlayerCount() - 1 ? ", " : ""));
	}
	//Lines 33 & 34 print a blank line.
	System.out.println();
	System.out.println();
	//Prompts the user to decide continuing or ending the program.
	System.out.print("Do you want to continue? (Y/N): ");
	decision = input.nextLine();
	
	} while (decision.equalsIgnoreCase("Y"));
	//Checks if the user "N". If so, the "End of line" message is printed.
	if (decision.equalsIgnoreCase("N")) {
		//Lines 41 & 42 print a blank line.
		System.out.println(); 
		System.out.println(); 
		//Prints the "End of line" message.	
		System.out.println("End of line.."); 
	}
	//Closes the scanner object.
	input.close(); 

	}//End TestSportsTeamApp.

}//End Main.
