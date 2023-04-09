/* 
		Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
			https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s	
		
		Coding with John. (2021, December 21). Generics in Java - Full Simple Tutorial [Video]. YouTube. 
			https://www.youtube.com/watch?v=K1iu1kXkVoA
		
		Coding with John. (2021, June 7). LinkedList vs ArrayList in Java Tutorial - Which Should You Use? [Video]. YouTube. 
			https://www.youtube.com/watch?v=5dscMs2hnDI
		
		Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
		Modified by Terrence Galamison 2023. 
		
	 	Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
			https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045	

		Visual Computer Science. (2022, January 16). Java Collections Explained (with examples) [Video]. YouTube. 
			https://www.youtube.com/watch?v=viTHc_4XfCA
*/
package cis505;
// Imports LinkedList class from library.
import java.util.LinkedList;
// Defines GenericQueue class with parameter E.
public class GenericQueue<E> {
	// Private date field for LinkedList.
	private LinkedList<E> list = new LinkedList<>();
	// Public method that adds an item to the beginning of the list.  
	public void enqueue(E item) {
		list.addLast(item);
	}
	// Public method to dequeue an item and remove it from the list. 
	public E dequeue() {
		// if list is empty, return null. 
		if (isEmpty()) {
			return null;
		}
		// If the list is not empty, remove first item and return it. 
		return list.removeFirst();
	}
	// Public method that returns the length of the list.
	public int size() {
		return list.size();
	}
		// Public method that checks if the list is empty and returns a boolean value. 
		public boolean isEmpty() {
		return list.isEmpty();
	}
}
