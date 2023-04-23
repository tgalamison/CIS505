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

import java.util.List;
// Defines public GenericDao interface.
public interface GenericDao<E, K> {
	// Method to find all entities and return them as a List.
	List<E> findAll();
	// Method to find an entity using the key.
	E findBy(K key);
	// Method to insert a new entity.
	void insert(E entity);
// Closes GenericDao interface.
}
