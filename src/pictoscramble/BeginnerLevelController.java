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
        private ToggleButton btnButtonFive;
        @FXML
        private ToggleButton btnButtonSix;
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
        double btnButtonFivex = btnButtonFive.getLayoutX();
        double btnButtonFivey = btnButtonFive.getLayoutY();
        double btnButtonSixx = btnButtonSix.getLayoutX();
        double btnButtonSixy = btnButtonSix.getLayoutY();
        
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
        }else if(btnButtonOne.isSelected()&&btnButtonFive.isSelected()){
            
                btnButtonOne.setLayoutX(btnButtonFivex);
                btnButtonOne.setLayoutY(btnButtonFivey);  
                btnButtonFive.setLayoutX(btnButtonOnex);
                btnButtonFive.setLayoutY(btnButtonOney);
                
                btnButtonOne.setSelected(false);
                btnButtonFive.setSelected(false);
                
        }else if(btnButtonOne.isSelected()&&btnButtonSix.isSelected()){
            
                btnButtonOne.setLayoutX(btnButtonSixx);
                btnButtonOne.setLayoutY(btnButtonSixy);  
                btnButtonSix.setLayoutX(btnButtonOnex);
                btnButtonSix.setLayoutY(btnButtonOney);
                
                btnButtonOne.setSelected(false);
                btnButtonSix.setSelected(false);
                
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
                
        }else if(btnButtonTwo.isSelected()&&btnButtonFive.isSelected()){
            
                btnButtonTwo.setLayoutX(btnButtonFivex);
                btnButtonTwo.setLayoutY(btnButtonFivey);  
                btnButtonFive.setLayoutX(btnButtonTwox);
                btnButtonFive.setLayoutY(btnButtonTwoy);
                
                btnButtonTwo.setSelected(false);
                btnButtonFive.setSelected(false);
                
        }else if(btnButtonTwo.isSelected()&&btnButtonSix.isSelected()){
            
                btnButtonTwo.setLayoutX(btnButtonSixx);
                btnButtonTwo.setLayoutY(btnButtonSixy);  
                btnButtonSix.setLayoutX(btnButtonTwox);
                btnButtonSix.setLayoutY(btnButtonTwoy);
                
                btnButtonTwo.setSelected(false);
                btnButtonSix.setSelected(false);;
                
        }else if(btnButtonThree.isSelected()&&btnButtonFour.isSelected()){
            
                btnButtonThree.setLayoutX(btnButtonFourx);
                btnButtonThree.setLayoutY(btnButtonFoury);  
                btnButtonFour.setLayoutX(btnButtonThreex);
                btnButtonFour.setLayoutY(btnButtonThreey);
                
                btnButtonThree.setSelected(false);
                btnButtonFour.setSelected(false);
                
        }else if(btnButtonThree.isSelected()&&btnButtonFive.isSelected()){
            
                btnButtonThree.setLayoutX(btnButtonFivex);
                btnButtonThree.setLayoutY(btnButtonFivey);  
                btnButtonFive.setLayoutX(btnButtonThreex);
                btnButtonFive.setLayoutY(btnButtonThreey);
                
                btnButtonThree.setSelected(false);
                btnButtonFive.setSelected(false);
                
        }else if(btnButtonThree.isSelected()&&btnButtonSix.isSelected()){
            
                btnButtonThree.setLayoutX(btnButtonSixx);
                btnButtonThree.setLayoutY(btnButtonSixy);  
                btnButtonSix.setLayoutX(btnButtonThreex);
                btnButtonSix.setLayoutY(btnButtonThreey);
                
                btnButtonThree.setSelected(false);
                btnButtonSix.setSelected(false);
                
        }else if(btnButtonFour.isSelected()&&btnButtonFive.isSelected()){
            
                btnButtonFour.setLayoutX(btnButtonFivex);
                btnButtonFour.setLayoutY(btnButtonFivey);  
                btnButtonFive.setLayoutX(btnButtonFourx);
                btnButtonFive.setLayoutY(btnButtonFoury);
                
                btnButtonFour.setSelected(false);
                btnButtonFive.setSelected(false);
                
        }else if(btnButtonFour.isSelected()&&btnButtonSix.isSelected()){
            
                btnButtonFour.setLayoutX(btnButtonSixx);
                btnButtonFour.setLayoutY(btnButtonSixy);  
                btnButtonSix.setLayoutX(btnButtonFourx);
                btnButtonSix.setLayoutY(btnButtonFoury);
                
                btnButtonFour.setSelected(false);
                btnButtonSix.setSelected(false);
                
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
