/* 
	Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
		https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s
	
	Coding with John. (2021, June 7). LinkedList vs ArrayList in Java Tutorial - Which Should You Use? [Video]. YouTube. 
			https://www.youtube.com/watch?v=5dscMs2hnDI
	
	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.

	Programming with Mosh. (2019, July 16). Java Tutorial for Beginners [Video]. YouTube. 
		https://www.youtube.com/watch?v=eIrMbAQSU34&t=3045
*/

package cis505;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    // Private date field.
	private List<Composer> composers;
	// Constructor with no argument.
	public MemComposerDao() {
		composers = new ArrayList<>();
		// Default list of composers.
		composers.add(new Composer(1, "Beethoven", "Classical"));
		composers.add(new Composer(2, "Mozart", "Classical"));
		composers.add(new Composer(3, "Bach", "Baroque"));
		composers.add(new Composer(4, "Handel", "Baroque"));
		composers.add(new Composer(5, "Stravinsky", "Modern"));
	}
	// Method that defines findAll that returns a list all Composer objects.
	public List<Composer> findAll() {
		// Returns a new ArrayList that contains all Composer objects.
		return new ArrayList<>(composers);
	}
	// Method that returns a single Composer object based on id.
	public Composer findBy(Integer id) {
		// Finds Composer object with matching id.
		for (Composer composer : composers) {
			if (composer.getId() == id) {
				return composer;
			}
		}
		return null;
	}
	// Method to insert a new Composer object to the list.
	public void insert(Composer composer) {
		composers.add(composer);
	}
// Closes MemComposerDao class.
}
