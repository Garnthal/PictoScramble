/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictoscramble;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author emmar
 */
public class AdminScreenController implements Initializable {
    @FXML
    private ListView<String> lvAdmins;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnStart;
    @FXML
    private Button btnNewAdmin;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnCancel;
    @FXML
    private TextField txtNewAdmin;
    @FXML
    private TextField txtPassword;
    
    final ObservableList<String> listItems = FXCollections.observableArrayList();
    
     public boolean isValidAdmin(String s){      
     String regex="[A-Za-z\\s]+";      
      return s.matches(regex);
 }
     
     public boolean isValidPassword(String s) {
         String regex="^[a-z0-9_-]{3,15}$";
         return s.matches(regex);
     }
    
    @FXML
    public void handle(KeyEvent ke)
    {
        if (ke.getCode().equals(KeyCode.ENTER))
        {
            //Ensures that null values aren't usable
            if(isValidAdmin(txtNewAdmin.getText())){
                
                listItems.add(txtNewAdmin.getText());
                
                txtNewAdmin.setVisible(false);
                btnAdd.setVisible(false);
                btnCancel.setVisible(false);
                
            }else{
                txtNewAdmin.setPromptText("Enter first name");
                
            }
               
           if(isValidPassword(txtPassword.getText())){
               
               txtNewAdmin.setVisible(false);
               txtPassword.setVisible(false);
               btnAdd.setVisible(false);
               btnCancel.setVisible(false);
            
           }else{
            
               txtPassword.setPromptText("Enter your password");
            }    
           }
        }
    
    @FXML
    private void NewAdmin(ActionEvent event){
  
        txtNewAdmin.setVisible(true);
        txtPassword.setVisible(true);
        btnAdd.setVisible(true);
        btnCancel.setVisible(true);     
        
    }
     
    @FXML
    private void Add(ActionEvent event){
 
         if(isValidAdmin(txtNewAdmin.getText())){
                
                listItems.add(txtNewAdmin.getText());
                
                txtNewAdmin.setVisible(false);
                btnAdd.setVisible(false);
                btnCancel.setVisible(false);
                
            }else{
                txtNewAdmin.setPromptText("Enter first name");
                
            }
               
           if(isValidPassword(txtPassword.getText())){
               
               txtNewAdmin.setVisible(false);
               txtPassword.setVisible(false);
               btnAdd.setVisible(false);
               btnCancel.setVisible(false);
            
           }else{
            
               txtPassword.setPromptText("Enter your password");
            }    
           }
    
    @FXML
    private void Cancel(ActionEvent event){
        txtNewAdmin.setVisible(false);
        txtPassword.setVisible(false);
        btnAdd.setVisible(false);
        btnCancel.setVisible(false);
    }    
    
    @FXML
    private void Exit(ActionEvent event){
        System.exit(0);
    }
    
    @FXML
    private void Start(ActionEvent event){
      
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lvAdmins.setItems(listItems);
    } 
}
