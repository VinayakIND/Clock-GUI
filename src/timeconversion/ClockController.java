/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author VINAYAK
 */
public class ClockController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private Button submitButton;
    @FXML private TextField hoursTextBox;
    @FXML private TextField minuteTextBox;
    @FXML private TextField secondTextBox;
    
    @FXML private Label hoursLabel;
    @FXML private Label minutesLabel;
    @FXML private Label secondsLabel;
    @FXML private Label militaryTimeLabel;
    @FXML private Label standardTimeLabel;
    @FXML private Label invalidInputLabel;
    
    /**
     * This method will get the user inputs from the UI and initializes our instance variables.
     * @param url
     * @param rb 
     */
    public void submitButtonPushed()
    {
        try {
            Time time = new Time(Integer.parseInt(hoursTextBox.getText()),
                             Integer.parseInt(minuteTextBox.getText()),
                             Integer.parseInt(secondTextBox.getText()));
            
            this.invalidInputLabel.setText("");
            this.militaryTimeLabel.setText("Military Time = " + time.toMilitaryTime().toString());
            this.standardTimeLabel.setText("Standard Time = " + time.toStandardTime().toString());
            System.out.printf("time = %s:%s:%s%n", hoursTextBox.getText(),minuteTextBox.getText(),secondTextBox.getText());
            }
        catch (IllegalArgumentException e){
            this.invalidInputLabel.setText(e.getMessage());
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.militaryTimeLabel.setText("");
        this.standardTimeLabel.setText("");
        this.invalidInputLabel.setText("");
        
        
    }    
    
}
