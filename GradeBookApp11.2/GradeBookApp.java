/* 
 	Bro Code. (2021, March 22). JavaFX GUI Full Course Free [Video]. YouTube. 
	https://www.youtube.com/watch?v=9XJicRt_FaI&t=82s
 	
 	Bro Code. (2020, October 7). Java FileWriter (write to a file) [Video]. YouTube. 
	https://www.youtube.com/watch?v=kjzmaJPoaNc
 	
 	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.*;
// This is the main class for the application.
public class GradeBookApp extends Application {
	// Define the fields for the Student's information.
    TextField firstNameField = new TextField();
    TextField lastNameField = new TextField();
    TextField courseField = new TextField();
    ComboBox<String> gradeComboBox = new ComboBox<>();
    TextArea resultsArea = new TextArea();
    // Main method that launches the JavaFX application.
    public static void main(String[] args) {
        launch(args);
    }
    	// This method is called when the JavaFX application is ran. 
        public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Grade Book");

        // Define the GridPane.
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Add Labels and corresponding TextFields or ComboBoxes to the GridPane.
        grid.add(new Label("First Name:"), 0, 0);
        grid.add(firstNameField, 1, 0);
        grid.add(new Label("Last Name:"), 0, 1);
        grid.add(lastNameField, 1, 1);
        grid.add(new Label("Course:"), 0, 2);
        grid.add(courseField, 1, 2);
        grid.add(new Label("Grade:"), 0, 3);
        gradeComboBox.getItems().addAll("A", "B", "C", "D", "F");
        grid.add(gradeComboBox, 1, 3);
        
        // Adds a results area to the grid.
        resultsArea.setEditable(false);
        grid.add(resultsArea, 0, 5, 3, 1);

        // Add Clear button and its action.
        Button clearButton = new Button("Clear Form");
        clearButton.setOnAction(e -> clearForm());
        grid.add(clearButton, 0, 4);

        // Add Save button and its action.
        Button saveButton = new Button("Save Entry");
        saveButton.setOnAction(e -> saveEntry());
        grid.add(saveButton, 1, 4);

        // Add View button and its action.
        Button viewButton = new Button("View Grades");
        viewButton.setOnAction(e -> viewGrades());
        grid.add(viewButton, 2, 4);
        gradeComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        	if (newValue != null) {
        		switch (newValue) {
        		case "A":
        			courseField.setStyle("-fx-control-inner-background: #a4c639;");
        			break;
        		case "B":
        			courseField.setStyle("-fx-control-inner-background: #f7d23e;");
        			break;
        		case "C":
        			courseField.setStyle("-fx-control-inner-background: #f7941e;");
        			break;
        		case "D":
        		case "F":
        			courseField.setStyle("-fx-control-inner-background: #ed1c24;");
        			break;
        		}
        	}
        });
               
        // Set the scene and show the stage.
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void clearForm() {
        // Clear all the fields.
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
        courseField.setStyle("-fx-control-inner-background: white;");
    }

    private void saveEntry() {
        // Writes to CSV file.
    	try {
            FileWriter csvWriter = new FileWriter("grades.csv", true);
            csvWriter.append(firstNameField.getText());
            csvWriter.append(",");
            csvWriter.append(lastNameField.getText());
            csvWriter.append(",");
            csvWriter.append(courseField.getText());
            csvWriter.append(",");
            csvWriter.append(gradeComboBox.getValue());
            csvWriter.append("\n");
            csvWriter.flush();
            csvWriter.close();
            // Clears the form.
            clearForm();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void viewGrades() {
        // Reads data from CSV file and updates TextArea.
    	try {
            BufferedReader csvReader = new BufferedReader(new FileReader("grades.csv"));
            String row;
            resultsArea.clear();
            while ((row = csvReader.readLine()) != null) {
            	String[] data = row.split(",");
            	if (data.length == 4) {
            	// Creates a new student object from the data.
            	Student student = new Student(data[0], data[1], data[2], data[3]);
            	
            	// Uses toString method to display students information.
            	resultsArea.appendText(student.toNiceString() + "\n");
            	}
            }
            // Closes the reader. 
            csvReader.close();
           } catch (IOException e) {
            // Prints a stack trace if an exception occurs. This helps find and fix problems if they happen. 
        	e.printStackTrace();
        }
    }
}



