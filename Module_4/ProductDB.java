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
// Defines the ProductDB class
public class ProductDB {
	// Public static method that accepts strings and returns Product objects.
	public static GenericQueue<Product> getProducts(String code) {
		// Creates new GenericQueue for Product objects.
		GenericQueue<Product> products = new GenericQueue<>();
		// Checks if argument equals b and ignores.
		if (code.equalsIgnoreCase("b")) {
			// Creates ball objects and adds them to the products queue.
			for (int i = 1; i <= 5; i++) {
				Ball ball = new Ball();
				ball.setCode("B" + i);
				ball.setDescription("Ball " + i);
				ball.setPrice(100 + i * 10);
				ball.setColor("Color " + i);
				products.enqueue(ball);
				}
		  // Checks if argument equals s and ignores.	
		} else if (code.equalsIgnoreCase("s")) {
			// Creates Shoe objects and adds them to products queue.	
			for (int i = 1; i <= 5; i++) {
					Shoe shoe = new Shoe();
					shoe.setCode("S" + i);
					shoe.setDescription("Shoe " + 1);
					shoe.setPrice(50 + i * 5);
					shoe.setSize(9 + i * 0.5);
					products.enqueue(shoe);
				}
		}
		// Checks if argument equals a and ignores.
		else if (code.equalsIgnoreCase("a")) {
			// Creates Bag objects and adds them to products queue.
			for (int i = 1; i <= 3; i++) {
				Bag bag = new Bag();
				bag.setCode("A" + i);
				bag.setDescription("Bag " + i);
				bag.setPrice(20 + i * 3);
				bag.setType((i * 2) + "-Ball Bag");
				products.enqueue(bag);
			}
		}
		// Returns products queue.
		return products;
	}
}
