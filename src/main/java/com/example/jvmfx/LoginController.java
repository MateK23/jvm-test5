package com.example.jvmfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField txt_usr;
    @FXML
    private PasswordField txt_pwd;
    // private Button loginButton;


    public void loginAction(ActionEvent actionEvent){
        if (txt_usr.getText().equals("test") && txt_pwd.getText().equals("test")){

        }
        System.out.println("Login credentials - ");
        System.out.println("User: " + txt_usr.getText());
        System.out.println("Pwd: " + txt_pwd.getText());
    }
}
