/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.net.URL;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

/**
 * FXML Controller class
 *
 * @author Joseph's Laptop
 */
public class BeginnerLevelController implements Initializable {

        @FXML
        private Button btnNext;
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
        
        public ToggleButton[] arrayButtons;
        
//        String[] arrayWords = new String[]{"apples", "crate", "bridge", "dogs", "eggs", "frog", "gold", "house", "jet", "tree"}; 
        
        
//        DBManager DBManager;
        
        int index;
        String temp;
        
        String[] currWord = new String[6];
        
        Random rnd = new Random();
        
  
        public BeginnerLevelController() throws SQLException
        {
//            try{
//            DBManager = new DBManager();
//            }catch(SQLException ex)
//            {
//                
//            }
//            
//            
//                
//            arrayWords = DBManager.getWords();
            
              
            //splits the word so each letter is an individual string in a string array
            //currWord = arrayWords[].split("(?!^)");
           
            
//            currWord = "apples".split("(?!^)");
//            
//        
//            //randomizes the letters of the word
//            for (int i = currWord.length - 1; i > 0; i--)
//            {
//                index = rnd.nextInt(i + 1);
//                if (index != i)
//                {
//                    temp = currWord[index];
//                    currWord[index] = currWord[i];
//                    currWord[i] = temp;
//                }
//            }
          
//                    
//            switch (currWord.length) {
//                case 4:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(false);
//                    btnButtonSix.setVisible(false);
//                    for(int i = 0; i < arrayButtonsThree.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsThree[i].setText(currWord[i]);
//                        }
//                    }       break;
//                case 5:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(true);
//                    btnButtonSix.setVisible(false);
//                    for(int i = 0; i < arrayButtonsTwo.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsTwo[i].setText(currWord[i]);
//                        }
//                    }   break;
//                case 6:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(true);
//                    btnButtonSix.setVisible(true);
//                    for(int i = 0; i < arrayButtonsOne.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsOne[i].setText(currWord[i]);
//                        }
//                    }   break;
//                default:
//                    break;
//            }
            
        }
        
        public void initializeToggleButtonArray() { 

            arrayButtons = new ToggleButton[6];  
            arrayButtons[0] = btnButtonOne;
            arrayButtons[1] = btnButtonTwo;
            arrayButtons[2] = btnButtonThree;
            arrayButtons[3] = btnButtonFour;
            arrayButtons[4] = btnButtonFive;
            arrayButtons[5] = btnButtonSix;
            
//            arrayButtonsTwo = new ToggleButton[5];  
//            arrayButtonsTwo[0] = btnButtonOne;
//            arrayButtonsTwo[1] = btnButtonTwo;
//            arrayButtonsTwo[2] = btnButtonThree;
//            arrayButtonsTwo[3] = btnButtonFour;
//            arrayButtonsTwo[4] = btnButtonFive;
//            
//            arrayButtonsThree = new ToggleButton[4];  
//            arrayButtonsThree[0] = btnButtonOne;
//            arrayButtonsThree[1] = btnButtonTwo;
//            arrayButtonsThree[2] = btnButtonThree;
//            arrayButtonsThree[3] = btnButtonFour;
            currWord = "apples".split("(?!^)");
           
            //randomizes the letters of the word
            for (int i = currWord.length - 1; i > 0; i--)
            {
                index = rnd.nextInt(i + 1);
                if (index != i)
                {
                    temp = currWord[index];
                    currWord[index] = currWord[i];
                    currWord[i] = temp;
                }
            }
            
            
                
                    for(int i = 0; i < arrayButtons.length; i++)
            {
                arrayButtons[i].setText(currWord[index]);
            }
        }
        
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
                btnButtonSix.setSelected(false);
                
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
                
        }else if(btnButtonFive.isSelected()&&btnButtonSix.isSelected()){
            
                btnButtonFive.setLayoutX(btnButtonSixx);
                btnButtonFive.setLayoutY(btnButtonSixy);  
                btnButtonSix.setLayoutX(btnButtonFivex);
                btnButtonSix.setLayoutY(btnButtonFivey);
                
                btnButtonFive.setSelected(false);
                btnButtonSix.setSelected(false);
                
        }
        
    }
    
    @FXML
    private void Next(ActionEvent event){
        
//            prevWord = currWord;

            //splits the word so each letter is an individual string in a string array
//            currWord = arrayWords[index].split("(?!^)");
            
            currWord = "apples".split("(?!^)");
           
            //randomizes the letters of the word
            for (int i = currWord.length - 1; i > 0; i--)
            {
                index = rnd.nextInt(i + 1);
                if (index != i)
                {
                    temp = currWord[index];
                    currWord[index] = currWord[i];
                    currWord[i] = temp;
                }
            }
            
            
                
                    for(int i = 0; i < arrayButtons.length; i++)
            {
                arrayButtons[i].setText(currWord[i]);
            }
        

            
            
//            switch (currWord.length) {
//                case 4:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(false);
//                    btnButtonSix.setVisible(false);
//                    for(int i = 0; i < arrayButtonsOne.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsOne[i].setText(currWord[i]);
//                        }
//                    }       break;
//                case 5:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(true);
//                    btnButtonSix.setVisible(false);
//                    for(int i = 0; i < arrayButtonsTwo.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsTwo[i].setText(currWord[i]);
//                        }
//                    }   break;
//                case 6:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(false);
//                    btnButtonSix.setVisible(true);
//                    for(int i = 0; i < arrayButtonsThree.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsThree[i].setText(currWord[i]);
//                        }
//                    }   break;
//                default:
//                    break;
//            }
        
    }
    
//        @FXML
//    private void Prev(ActionEvent event){
//            
//            //splits the word so each letter is an individual string in a string array
////            currWord = arrayWords[index].split("(?!^)");
//            currWord = prevWord[index].split("(?!^)");
//            //randomizes the letters of the word
//            for (int i = currWord.length - 1; i > 0; i--)
//            {
//                index = rnd.nextInt(i + 1);
//                if (index != i)
//                {
//                    temp = currWord[index];
//                    currWord[index] = currWord[i];
//                    currWord[i] = temp;
//                }
//            }
//            
//            switch (currWord.length) {
//                case 4:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(false);
//                    btnButtonSix.setVisible(true);
//                    for(int i = 0; i < arrayButtonsThree.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsThree[i].setText(currWord[i]);
//                        }
//                    }       break;
//                case 5:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(true);
//                    btnButtonSix.setVisible(false);
//                    for(int i = 0; i < arrayButtonsTwo.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsTwo[i].setText(currWord[i]);
//                        }
//                    }   break;
//                case 6:
//                    btnButtonOne.setVisible(true);
//                    btnButtonTwo.setVisible(true);
//                    btnButtonThree.setVisible(true);
//                    btnButtonFour.setVisible(true);
//                    btnButtonFive.setVisible(false);
//                    btnButtonSix.setVisible(false);
//                    for(int i = 0; i < arrayButtonsOne.length; i++)
//                    {
//                        for(int j = 0; j < currWord.length; j++){
//                            arrayButtonsOne[i].setText(currWord[i]);
//                        }
//                    }   break;
//                default:
//                    break;
//            }
//        
//        
//    }
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initializeToggleButtonArray();
        
    }    
    
}
