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

import java.util.Scanner;
// Defines TestComposerApp class.
public class TestComposerApp {
	// Define the main method.
	public static void main(String[] args) {
		MemComposerDao composerDao = new MemComposerDao();
		Scanner scanner = new Scanner(System.in);
		int choice;
		// Starts the main loop for the menu. 
		while (true) {
			// Displays welcome message to user. 
			System.out.println("Welcome to the Composer App");
			// Displays menu options to user. 
			System.out.println("\nMENU OPTIONS");
			System.out.println("1. View Composers");
			System.out.println("2. Find Composers");
			System.out.println("3. Add Composers");
			System.out.println("4. Exit");
			System.out.print("\nPlease choose an option");
			choice = scanner.nextInt();
			// Reads the user's choice.
			switch (choice) {
			case 1:
				// View Composers.
				System.out.println("\nComposers List");
				for (Composer composer : composerDao.findAll()) {
					System.out.println(composer.toString() + "\n");
				}
				break;
			case 2:
			// Find Composers.
			System.out.print("\nEnter the composer's ID: ");
			int id = scanner.nextInt();
			Composer composer = composerDao.findBy(id);
			if (composer != null) {
				System.out.println("\nComposer Details:\n" + composer.toString());
			} else {
				System.out.println("\nComposer not found.");
			}
			break;
			case 3:
			//Add Composer
				System.out.print("\nEnter the composer's ID: ");
				int newId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter the composer's name: ");
				String name = scanner.nextLine();
				System.out.print("Enter the composer's genre: ");
				String genre = scanner.nextLine();
				
				Composer newComposer = new Composer(newId, name, genre);
				composerDao.insert(newComposer);
				System.out.println("\nComposer added successfully!");
				break;
			case 4:
				// Exit & print's the goodbye message. 
				System.out.println("\nGoodbye!");
				// Closes the scanner object.
				scanner.close();
				System.exit(0);
				break;
			default:
				// Prints invalid option message to user.
				System.out.println("\nInvalid option. Please try again. ");
				break;
			}
			System.out.println("\n------------------------------------------\n");
		}

	}
}
