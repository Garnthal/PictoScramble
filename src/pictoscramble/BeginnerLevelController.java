/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Joseph's Laptop
 */
public class BeginnerLevelController extends Pane{

        @FXML
        private Button btnButtonOne;
        @FXML
        private Button btnButtonTwo;
        @FXML
        private Button btnButtonThree;
        @FXML
        private Button btnButtonFour;
        


    public BeginnerLevelController() {

    }


    @FXML
    private void swap() {
        double btnButtonOnex = btnButtonOne.getLayoutX();
        double btnButtonOney = btnButtonOne.getLayoutY();
        double btnButtonTwox = btnButtonTwo.getLayoutX();
        double btnButtonTwoy = btnButtonTwo.getLayoutY();
        btnButtonOne.setLayoutX(btnButtonTwox);
        btnButtonOne.setLayoutY(btnButtonTwoy);
        btnButtonTwo.setLayoutX(btnButtonOnex);
        btnButtonTwo.setLayoutY(btnButtonOney);
    }
}

    

