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
//Defines the Team class.
public class Team {
	//Declares a private data field that stores the team name with an empty string as the default value.
	private String teamName = "";
	//Declares a private data field that stores the current player names with a default size of 20.
	private String[] players = new String[20];
	//Declares a private data field that stores the current player count with a default value of 0.
	private int playerCount = 0;
//A constructor that takes the team name as an argument.	
public Team(String teamName) {
	//Sets the instance variable teamName to the value passed as an argument.
	this.teamName = teamName;
}
//A method to add a player to the players array.
public void addPlayer(String player) {
	//Adds the player to the player array and increments the player count.
	players[playerCount++] = player;
}
//A method that returns the players array.
public String[] getPlayers() {
	return players;
}
//A method that returns the current player count. 
public int getPlayerCount() {
	return playerCount;
}
//A method that returns the current team names. 
public String getTeamName() {
	return teamName;
}//Ends Team application.

}//Ends main.

