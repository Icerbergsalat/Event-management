package com.example.eventmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    private void checkLogin(){
        if (username.getText().equalsIgnoreCase(User.users.get(0).getUsername()) && password.getText().equalsIgnoreCase(User.users.get(0).getPassword())){
            System.out.println("bingerbonger");
        } else {
            System.out.println("du dum stegemand");
        }
    }
    @FXML
    private void login(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("evnet-manager.fxml"));
    }
}