/* 
		Alex Lee. (2020, January 31). Java Subclass and Superclass Tutorial - Real College Example [Video]. YouTube.
			https://www.youtube.com/watch?v=iV-rrFETXjY
		
		Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
			https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s
		
		Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
		Modified by Terrence Galamison 2023. 
		
	 	Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
			https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045	
*/
package cis505;
// Defines the Ball class and extends the Product superclass.
public class Ball extends Product{
	// Private data field for the bowling ball color.
	private String color;
	// Constructor that sets default values in the data fields and calls the superclass constructor for setting the color.
	public Ball() {
		super();
		this.color = "";
	}
	// Public getter method for the color field.
	public String getColor() {
		return color;
	}
	// Public setter method for the color field.
	public void setColor(String color) {
		this.color = color;
	}
	// Overrides the toString method and returns a design of the Ball object and changes the color info of the superclass.
	public String toString() {
		return super.toString() + "\n" +
				"Color--> " + color;
	}
}
