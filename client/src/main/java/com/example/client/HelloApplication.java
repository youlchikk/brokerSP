package com.example.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import java.net.URL;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("BROKER");


        Label label = new Label("Hello");
        label.setLayoutY(80);    // установка положения надписи по оси Y
        label.setLayoutX(80);   // установка положения надписи по оси X

        Pane group = new Pane(label);
       // group.getStyleClass().add("root");
        Scene scene = new Scene(group);
        scene.getStylesheets().add(getClass().getResource("/styles/helloApplicationCSS.css").toExternalForm());

        //group.setStyle("-fx-background-color: red;");

        stage.setScene(scene);

        stage.setWidth(900);
        stage.setHeight(600);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}