/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LaunchClock extends Application {

    
    public static void main(String[] args){
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("Clock.fxml"));
       
       AnchorPane createClockLayout = loader.load();
       Scene createClockScene = new Scene(createClockLayout);
       primaryStage.setScene(createClockScene);
       primaryStage.setTitle("Multipurpose-Clock");
       primaryStage.show();
       
    }
    
}
