/* 
	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.

	Bro Code. (2020, November 10). Java Full Course for free [Video]. 
YouTube. https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s.
*/

package cis505;

public class Fan {
	public static final int STOPPED = 0; // Defines constant named 'STOPPED' that represents a fan speed with an integer
											// '0'.
	public static final int SLOW = 1; // Defines constant named 'SLOW' that represents a fan speed with an integer
										// '1'.
	public static final int MEDIUM = 2; // Defines constant named 'MEDIUM' that represents a fan speed with an integer
										// '2'.
	public static final int FAST = 3; // Defines constant named 'FAST' that represents a fan speed with an integer
										// '3'.

	private int speed; // Declares a private instance variable type 'int' that stores the speed of the
						// fan in the form of an integer.
	private boolean on; // Declares a private instance variable type 'boolean' that stores the on/off
						// status of the fan in the form of true or false.
	private double radius; // Declares a private instance variable type 'double' that stores the radius of
							// the fan in the form of decimals.
	private String color; // Declares a private instance variable type 'String' that stores the color of
							// the fan in the form of characters.

	public Fan() { // Defines the constructor with a public access modifier which enables it to be
					// called from any class.
		speed = STOPPED; // Initializes the 'speed' instance variable with the value of the constant
							// 'STOPPED', which mean zero. This sets the default fan speed to stopped.
		on = false; // Initializes the 'on' instance variable with the boolean value of false. This
					// sets the default on/off state of the fan to off.
		radius = 6; // Initializes the 'radius' instance variable with the value of 6. This sets the
					// default radius of the fan to 6.
		color = "white"; // Initializes the 'color' instance variable with the String value 'white'. This
							// sets the default color of the fan to white.
	}

	public Fan(int speed, boolean on, double radius, String color) { // Constructor with public access modifier and four
																		// arguments.
		this.speed = speed; // Enables the 'speed' instance variable with the provided values for the
							// 'speed' argument when the constructor is called. The .this keyword references
							// this objects 'speed' variable.
		this.on = on; // Enables the 'on' instance variable with the boolean value 'on' when the
						// constructor is called. The .this keyword references this objects 'on'
						// variable.
		this.radius = radius; // Enables the 'radius' instance variable with the value 'radius' when the
								// constructor is called. The .this keyword references this objects 'radius'
								// variable.
		this.color = color; // Enables the 'color' instance variable with the string value 'color' when the
							// constructor is called. The .this keyword references this objects 'color'
							// variable.
	}

	// Rows 35-64 are methods that define getter and mutator variables for the 'fan'
	// class.
	public int getSpeed() { // Public access modifier for the method 'getSpeed()' for the 'speed' instance
							// variable in the 'Fan' class.
		return speed; // When 'getSpeed' method is called, returns the current value of the 'speed'
						// instance variable.
	}

	public void setSpeed(int speed) { // Method sets a new integer 'speed' value for the instance variable.
		this.speed = speed; // Sets the value of the 'speed' variable that was set in line 39 and uses the
							// .this keyword to distinguish it from the 'speed' parameter.
	}

	// Rows 43 & 44 defines method 'isOn()' for the 'on' instance variable for the
	// 'Fan' class and returns the current value of the 'on' variable for that
	// specific object.
	public boolean isOn() {
		return on;
	}

	// Rows 47 & 48 defines the public mutator method 'setOn(boolean on) for the
	// 'on' instance variable in the 'Fan' class and uses the .this keyword to
	// distinguish it from the 'on' parameter.
	public void setOn(boolean on) {
		this.on = on;
	}

	// Rows 51 & 52 defines the public accessor method 'getRadius()' for the
	// 'radius' instance variable in the 'Fan' class and returns the current value
	// of the 'radius' variable in this specific object.
	public double getRadius() {
		return radius;
	}

	// Rows 55 & 56 defines the public mutator method 'setRadius(double radius' for
	// the 'radius' instance variable in the 'Fan' class and uses the .this keyword
	// to distinguish it from the 'radius' parameter.
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Rows 59 & 60 defines the public accessor method 'getColor()' for the 'color'
	// instance variable in the 'Fan' class and returns the current 'color' value in
	// string format.
	public String getColor() {
		return color;
	}

	// Rows 63 & 64 define the public mutator method 'setColor(String color)' for
	// the 'color' instance variable in the 'Fan' class and uses the .this keyword
	// to distinguish it from the 'color' parameter.
	public void setColor(String color) {
		this.color = color;
	}

	@Override // Overrides 'toString' method from the 'object' class.
	public String toString() { // Modifier 'public' access allows this method to be called from any class.
								// 'String means that the method will return a string value.
		if (on) { // if statement that checks if 'on' instance variable is true. If true, the
					// following code will be executed.
			return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius; // When executed, this line
																						// returns a string
																						// representation of the fan
																						// that includes speed, color
																						// and radius.
		} else { // else statement that executes if the 'if' condition is not meant.
			return "Fan color: " + color + ", radius: " + radius + ", fan is off"; // If the 'if' condition is not
																					// meant, this line returns a string
																					// representation that includes the
																					// color, radius, and a "fan is off"
																					// message.
		} // End of Fan
	}
} // End Main
