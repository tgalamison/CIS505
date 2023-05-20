/* 
 	Bro Code. (2020, November 10). Java Full Course for free [Video]. YouTube. 
	https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1234s
 	
 	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.
*/
public class Student {
	private String firstName;
	private String lastName;
	private String course;
	private String grade;
	
	public Student() {}
	
	public Student(String firstName, String lastName, String course, String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;
	}
	// Getters and setters.
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString() {
		// Dictates the way that the data is displayed in the results window.
		return firstName + " " + lastName + ", " + course + ", " + grade;
	}
}



