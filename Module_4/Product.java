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
// Defines the Product class
public class Product {
	// Private data fields for the product code, description, and price.
	private String code;
	private String description;
	private double price;
	// No-argument constructor for the data fields with default values.
	public Product() {
		this.code = "";
		this.description = "";
		this.price = 0;
	}
	// Public getter method for the code field.
	public String getCode() {
		return code;
	}
	// Public getter method for the description field.
	public String getDescription() {
		return description;
	}
	// Public getter method for the price field.
	public double getPrice() {
		return price;
	}
	// Public setter method for the code field.
	public void setCode(String code) {
		this.code = code;
	}
	// Public setter method for the description field.
	public void setDescription(String description) {
		this.description = description;
	}
	// Public setter method for the price field.
	public void setPrice(double price) {
		this.price = price;
	}
	// Overrides the toString method and returns a string description of the Product object.
	public String toString() {
		return "Code: " + code + "\n" +
			   "Description: " + description + "\n" +
			   "Price: " + price;
	}
}
