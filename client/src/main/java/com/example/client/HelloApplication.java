package com.example.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root =  (Parent) FXMLLoader.load(getClass().getResource("/com/example/client/hello-view.fxml"));
        HelloController.setupStage(stage);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/styles/helloApplicationCSS.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
