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
//Declare CustomerDB class.
public class CustomerDB {
	//Public static method for getCustomer with an integer argument and a return type of Customer.
	public static Customer getCustomer(Integer id) {
        //Checks if id matches 1007.
        if (id == 1007) {
            //Returns a new Customer object for id 1007 with unique fields.
            return new Customer("John", "6852 Cherry St", "Bellevue", "68123");
        } else if (id == 1008) {
            //If id is not 1007, checks if id equals 1008 and returns new Customer object.
        	return new Customer("Bob", "2845 Bird Dr", "San Antonio", "25358");
        } else if (id == 1009) {
            //If id is not 1007 or 1008, checks if id equals 1009 and returns a new Customer object.
        	return new Customer("Charlie", "5475 Crimson Ln", "Houston", "47898");
        } else {
            //if no id matches, returns default Customer object with blank fields.
            return new Customer();
        }
    }
}

