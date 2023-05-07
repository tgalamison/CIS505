/* 
	Bro Code. (2021, March 22). JavaFX GUI Full Course Free [Video]. YouTube. 
	https://www.youtube.com/watch?v=9XJicRt_FaI&t=82s
	
	Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
		Comprehensive Version (12th ed.). Pearson Education, Inc. 
Modified by Terrence Galamison 2023.
*/
package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.text.NumberFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GalamisonFutureValueApp extends Application {
	
	// Declare UI components as private member variables.
	private TextField textField1;
    private TextField textField2;
    private TextArea textArea;
    private Label lblMonthlyPayment;
    private Label lblYears;
    private Label lblInterestRate;
    private Label lblFutureValue;
    private Label lblInterestRateFormat;
    private ComboBox<Integer> comboBox;
    private Button btnClear;
    private Button btnCalculate;
    
    private static final int MONTHS_IN_YEAR = 12;
    
    // Main method for the application.
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) {
    	// Starts the UI sections.
    	textField1 = new TextField();
    	textField2 = new TextField();
    	textArea = new TextArea();
    	
    	lblMonthlyPayment = new Label("Monthly Payment:");
    	lblInterestRate = new Label("Interest Rate:");
    	lblYears = new Label("Years:");
    	lblFutureValue = new Label("Future Value:");
    	lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    	
    	comboBox = new ComboBox<>();
    	for (int i = 1; i <= 10; i++) {
    		comboBox.getItems().add(i);
    	}
    	comboBox.setValue(1);
    	
    	btnClear = new Button("Clear");
    	btnCalculate = new Button("Calculate");
    	// Creates the GridPane and applies its properties.
    	GridPane gridPane = new GridPane();
    	gridPane.setAlignment(Pos.CENTER);
    	gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    	gridPane.setHgap(5.5);
    	gridPane.setVgap(5.5);
    	// Adds UI components.
    	gridPane.add(lblMonthlyPayment, 0, 0);
    	gridPane.add(textField1, 1, 0);
    	gridPane.add(lblInterestRate, 0, 1);
    	gridPane.add(textField2, 1, 1);
    	gridPane.add(lblInterestRateFormat, 1, 2);
    	gridPane.add(lblYears, 0, 3);
    	gridPane.add(comboBox, 1, 3);
    	gridPane.add(lblFutureValue, 0, 4);
    	gridPane.add(textArea, 1, 4);
    	// Sets the horizontal alignment for IntererstRateFormat and its color.
    	GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
    	lblInterestRateFormat.setTextFill(Color.RED);
    	// Creates clear and calculate buttons.
    	HBox actionBtnContainer = new HBox();
    	actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
    	actionBtnContainer.setSpacing(10);
    	actionBtnContainer.getChildren().add(btnClear);
    	actionBtnContainer.getChildren().add(btnCalculate);
    	gridPane.add(actionBtnContainer, 1, 6);
    	// Sets the title and shows the scene.
    	primaryStage.setTitle("Galamison Future Value App");
    	primaryStage.setScene(new Scene(gridPane));
    	primaryStage.show();
    	// These are the action handlers for the Clear and Calculate buttons.
    	btnClear.setOnAction(e -> clearFormFields());
    	btnCalculate.setOnAction(e -> calculateResults());
    }
    	// Method to calculate the future value from the inputs.
    	public static double calculateFutureValue(double monthlyPayment, double rate, int years) {
    		int months = years * MONTHS_IN_YEAR;
    		double interestRate = (1 + rate / 100);
    		double presentValue = monthlyPayment * months;
    		double futureValue = presentValue * Math.pow(interestRate, months);
    		return futureValue;
    	}
    	// Method for the clear form fields.
    	private void clearFormFields() {
    		textField1.setText("");
    		textField2.setText("");
    		textArea.setText("");
    		lblFutureValue.setText("");
    		comboBox.setValue(0);
    	}
    	// Method to calculate the results and update the UI.
    	private void calculateResults() {
    		// Gets the inputs from the form fields.
    		double monthlyPayment = Double.parseDouble(textField1.getText());
    		double interestRate = Double.parseDouble(textField2.getText());
    		int years = comboBox.getValue();
    		// Calculates the future value.
    		double futureValue = calculateFutureValue(monthlyPayment, interestRate, years);
    		// Formats the future value to currency.
    		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    		String formattedFutureValue = currencyFormat.format(futureValue);
    		// Updates the UI with the results.
    		lblFutureValue.setText("Calculation as of " + getTodaysDate());
    		textArea.setText("The future value is " + formattedFutureValue);
    	}
    	// Method to format the current date as a string.
    	private String getTodaysDate() {
    		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    		return sdf.format(new Date());
    	}   	
    	
    }


