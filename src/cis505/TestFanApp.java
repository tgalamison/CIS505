package cis505;

public class TestFanApp {
		
	public static void main(String[] args) { //Start of main method.
		Fan defaultFan = new Fan(); //This line creates a new instance of the 'Fan' class with the default constructor.
        System.out.println("Default Fan: " + defaultFan.toString()); //This line prints a string default representation of the 'defaultFan' object'.

        Fan customFan = new Fan(Fan.MEDIUM, true, 8, "blue"); //This line creates a new instance of the 'Fan' class using the argument constructor. Values of 'medium speed', 'on','8 radius' and 'blue color', are set to the 'customFan' object.  
        System.out.println("Custom Fan: " + customFan.toString()); //This line prints a string representation of the 'customFan' object from the result of the 'toString()' method call. The result of this program execution is Default Fan: Fan color: white, radius: 6.0, fan is off Custom Fan: Fan speed: 2, color: blue, radius: 8.0
    } //End TestFanApp
} //End main.
