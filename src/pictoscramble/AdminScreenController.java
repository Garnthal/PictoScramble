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
    
    @FXML
    public void handle(KeyEvent ke)
    {
        if (ke.getCode().equals(KeyCode.ENTER))
        {
            //Ensures that null values aren't usable
           if(txtNewAdmin.getText().equals("")){
               
                txtNewAdmin.setPromptText("Enter your name");
            }else{              
               listItems.add(txtNewAdmin.getText());
               
               txtNewAdmin.setVisible(false);
               txtPassword.setVisible(false);
               btnAdd.setVisible(false);
               btnCancel.setVisible(false);
           }
               
           if(txtPassword.getText().equals("")) {
            txtPassword.setPromptText("Enter your password");
            }else{
            
            txtNewAdmin.setVisible(false);
               txtPassword.setVisible(false);
               btnAdd.setVisible(false);
               btnCancel.setVisible(false);
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
 
        if(txtNewAdmin.getText().equals("")){
            txtNewAdmin.setPromptText("Enter your name");
        }else{
        listItems.add(txtNewAdmin.getText());
        
        if(txtPassword.getText().equals("")) {
            txtPassword.setPromptText("Enter your password");
        }else{
            listItems.add(txtPassword.getText());
        }
        
        txtNewAdmin.setVisible(false);
        txtPassword.setVisible(false);
        btnAdd.setVisible(false);
        btnCancel.setVisible(false);
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
