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
// Define shoe class and extends the Product superclass.
public class Shoe extends Product{
	// Private data field for the shoe size.
	private double size;
	// Sets default values for the constructor data fields and sets the superclass size to zero.
	public Shoe() {
		super();
		this.size = 0;
	}
	// Public getter method for the size field.
	public double getSize() {
		return size;
	}
	// Public setter method for the size field.
	public void setSize(double size) {
		this.size = size;
	}
	// Overrides the toString method and returns shoe object. Changes the size info to string of the superclass.
	public String toString() {
		return super.toString() + "\n" +
		"Size: " + size;
	}
}
