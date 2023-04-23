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

public class Composer {
	// Private data fields.
	private int id;
	private String name;
	private String genre;
	// Constructor with default values.
	public Composer() {
		this.id = 0;
		this.name = "";
		this.genre = "";
	}
	// Argument constructor.
	public Composer(int id, String name, String genre) {
		this.id = id;
		this.name = name;
		this.genre = genre;
	}
	// Accessor methods. 
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}
	public String toString() {
		return "ID: " + id + "\n" +
			   " Name: " + name + "\n" +
			   "Genre: " + genre;	
			
	}
}
