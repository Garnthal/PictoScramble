/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Joseph's Laptop
 */
public class Main extends Application {
    public static Stage homeStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        homeStage = primaryStage;
        
        Parent root = FXMLLoader.load(getClass().getResource("UserScreen.fxml"));
        
        
        homeStage.setScene(new Scene(root));
        homeStage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
