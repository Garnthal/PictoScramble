/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleButton;

/**
 * FXML Controller class
 *
 * @author Joseph's Laptop
 */
public class BeginnerLevelController implements Initializable {

    @FXML
        private ToggleButton btnButtonOne;
        @FXML
        private ToggleButton btnButtonTwo;
        @FXML
        private ToggleButton btnButtonThree;
        @FXML
        private ToggleButton btnButtonFour;
        
        @FXML
    private void One(ActionEvent event){
        double btnButtonOnex = btnButtonOne.getLayoutX();
        double btnButtonOney = btnButtonOne.getLayoutY();
        double btnButtonTwox = btnButtonTwo.getLayoutX();
        double btnButtonTwoy = btnButtonTwo.getLayoutY();
        double btnButtonThreex = btnButtonThree.getLayoutX();
        double btnButtonThreey = btnButtonThree.getLayoutY();
        double btnButtonFourx = btnButtonFour.getLayoutX();
        double btnButtonFoury = btnButtonFour.getLayoutY(); 
        
        if(btnButtonOne.isSelected()&&btnButtonTwo.isSelected()){
                        
                btnButtonOne.setLayoutX(btnButtonTwox);
                btnButtonOne.setLayoutY(btnButtonTwoy);  
                btnButtonTwo.setLayoutX(btnButtonOnex);
                btnButtonTwo.setLayoutY(btnButtonOney);
                
                btnButtonOne.setSelected(false);
                btnButtonTwo.setSelected(false);
                
        }else if(btnButtonOne.isSelected()&&btnButtonThree.isSelected()){
            
                btnButtonOne.setLayoutX(btnButtonThreex);
                btnButtonOne.setLayoutY(btnButtonThreey);  
                btnButtonThree.setLayoutX(btnButtonOnex);
                btnButtonThree.setLayoutY(btnButtonOney);
                
                btnButtonOne.setSelected(false);
                btnButtonThree.setSelected(false);
                
        }else if(btnButtonOne.isSelected()&&btnButtonFour.isSelected()){
      
                btnButtonOne.setLayoutX(btnButtonFourx);
                btnButtonOne.setLayoutY(btnButtonFoury);  
                btnButtonFour.setLayoutX(btnButtonOnex);
                btnButtonFour.setLayoutY(btnButtonOney);
                
                btnButtonOne.setSelected(false);
                btnButtonFour.setSelected(false);
        }else if(btnButtonTwo.isSelected()&&btnButtonThree.isSelected()){
            
                btnButtonTwo.setLayoutX(btnButtonThreex);
                btnButtonTwo.setLayoutY(btnButtonThreey);  
                btnButtonThree.setLayoutX(btnButtonTwox);
                btnButtonThree.setLayoutY(btnButtonTwoy);
                
                btnButtonTwo.setSelected(false);
                btnButtonThree.setSelected(false);
                
        }else if(btnButtonTwo.isSelected()&&btnButtonFour.isSelected()){
            
                btnButtonTwo.setLayoutX(btnButtonFourx);
                btnButtonTwo.setLayoutY(btnButtonFoury);  
                btnButtonFour.setLayoutX(btnButtonTwox);
                btnButtonFour.setLayoutY(btnButtonTwoy);
                
                btnButtonTwo.setSelected(false);
                btnButtonFour.setSelected(false);
                
        }else if(btnButtonThree.isSelected()&&btnButtonFour.isSelected()){
            
                btnButtonThree.setLayoutX(btnButtonFourx);
                btnButtonThree.setLayoutY(btnButtonFoury);  
                btnButtonFour.setLayoutX(btnButtonThreex);
                btnButtonFour.setLayoutY(btnButtonThreey);
                
                btnButtonThree.setSelected(false);
                btnButtonFour.setSelected(false);
                
        }
        
    }
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
