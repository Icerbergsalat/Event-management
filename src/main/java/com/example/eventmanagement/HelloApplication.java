package com.example.eventmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void changeScene(){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("evnet-manager.fxml"));
        launch();
    }
    public static void initialize(){
        try {
            ArrayList<String> data = FileManager.readFile("hola.txt");
            for (String user : data) {
                String[] parts = user.split(" ");
                User.users.add(new User(Integer.valueOf(parts[0]), parts[1], parts[2]));;
            }
        } catch (Exception e) {
        }
    }
}