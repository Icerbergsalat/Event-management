package com.example.eventmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginbtn, MainMenubtn, Adminbtn, Profilbtn, Eventbtn;
    @FXML
    private Label newsLabel;

    @FXML
    private void checkLogin(){
        try {
            for (User user : UserManager.getInstance().users) {
                if (username.getText().equalsIgnoreCase(user.getUsername()) && password.getText().equalsIgnoreCase(user.getPassword())) {
                    login();
                    return;
                }
            }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
            return;
    }

    @FXML
    private void login() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("evnet manager.fxml"));

        Stage window = (Stage) loginbtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }

    @FXML
    private void mainMenu() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("evnet manager.fxml"));

        Stage window = (Stage) MainMenubtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }

    @FXML
    private void profile() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileScene.fxml"));

        Stage window = (Stage) Profilbtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }

    @FXML
    private void event() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("EventScene.fxml"));

        Stage window = (Stage) Eventbtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }

    @FXML
    private void admin() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AdminScene.fxml"));

        Stage window = (Stage) Adminbtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 600));
    }

    @FXML
    private void koncert() throws Exception{
        EventManager.eventfactory("koncert");
        update();
    }

    @FXML
    private void konference() throws Exception{
        EventManager.eventfactory("konference");
        update();
    }

    @FXML
    private void workshop() throws Exception{
        EventManager.eventfactory("workshop");
        update();
    }

    @FXML
    public void update(){
        newsLabel.setText(NewsAgency.litseners.get(0).news);
    }
}