/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import static pictoscramble.Main.homeStage;

/**
 * FXML Controller class
 *
 * @author Joseph Dion
 */
public class UserScreenController implements Initializable {
    
    @FXML
    private ListView<String> lvUsers;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnNewUser;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnCancel;
    @FXML
    private TextField txtNewUser;
    
    Validation validation;
    
    //public UserScreenController() {
    //Validation validation = new Validation();
    //txtNewUser = validation.isLegalUsername();
    
   // if(!TextField.getText().validUsername()){
        
   // };
//}
    
    
 public boolean isValidName(String s){      
     String regex="[A-Za-z\\s]+";      
      return s.matches(regex);
 }

    
    final ObservableList<String> listItems = FXCollections.observableArrayList(); 
   
    @FXML
    public void handle(KeyEvent ke)
    {
        if (ke.getCode().equals(KeyCode.ENTER))
        {
            //Ensures that null values aren't usable
            if(isValidName(txtNewUser.getText())){
                
                listItems.add(txtNewUser.getText());
                
                txtNewUser.setVisible(false);
                btnAdd.setVisible(false);
                btnCancel.setVisible(false);
                
            }else{
                txtNewUser.setPromptText("Enter first name");
                
            }
        }
    }
    
    @FXML
    private void NewUser(ActionEvent event){
  
        txtNewUser.setVisible(true);
        btnAdd.setVisible(true);
        btnCancel.setVisible(true);
        
    }
     
    @FXML
    private void Add(ActionEvent event){
        
         //Ensures that null values aren't usable
            if(isValidName(txtNewUser.getText())){
                
                listItems.add(txtNewUser.getText());
                
                txtNewUser.setVisible(false);
                btnAdd.setVisible(false);
                btnCancel.setVisible(false);
                
            }else{
                txtNewUser.setPromptText("Enter first name");
                
            }
        }
    
    @FXML
    private void Cancel(ActionEvent event){
        txtNewUser.setVisible(false);
        btnAdd.setVisible(false);
        btnCancel.setVisible(false);
    }    
    
    @FXML
    private void Exit(ActionEvent event){
        //exits the program when the exit button is clicked
        System.exit(0);
    }
    
    @FXML
    private void Delete(ActionEvent event) throws IOException{
        if(isValidName(txtNewUser.getText())){
                
                listItems.remove(txtNewUser.getText());
                
                txtNewUser.setVisible(false);
                btnAdd.setVisible(false);
                btnCancel.setVisible(false);
                
            }else{
                txtNewUser.setPromptText("Enter first name");
                
            }
    }
    
    @FXML
    private void Start(ActionEvent event) throws IOException{ 
    // Swap screen
    homeStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("BeginnerLevel.fxml"))));
        
    }
    
    @FXML
    
    private void Admin(ActionEvent event) throws IOException{
        homeStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminScreen.fxml"))));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lvUsers.setItems(listItems);
    }    
    
}
