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
//Declare Customer class.
public class Customer {
		//Declare private data fields for the Customer class.
		private String name;
		private String address;
		private String city;
		private String zip;
		//Constructor for creating a default customer
		public Customer() {
			this.name = "";
			this.address = "";
			this.city = "";
			this.zip = "";
		}
		//Constructor for creating a customer with values for name, address, city and zip.
		public Customer(String name, String address, String city, String zip) {
			this.name = name;
			this.address = address;
			this.city = city;
			this.zip = zip;
		}
		//Accessor method for the name field.
		public String getName() {
			return name;
		}
		//Accessor method for the address field.
		public String getAddress() {
			return address;
		}
		//Accessor method for the city field.
		public String getCity() {
			return city;
		}
		//Accessor method for the zip code field.
		public String getZip() {
			return zip;
		}
		//Override method that returns a description for a customer.
		public String toString() {
			return "Name: " + name + "\n" +
				   "Address: " + address + "\n" +
				   "City: " + city + "\n" +
				   "Zip:" + zip;
					}
	}
	

   	    
