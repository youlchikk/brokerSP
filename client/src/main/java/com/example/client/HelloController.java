package com.example.client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button buttonLogUser;
    @FXML
    private Button buttonRegister;
    @FXML
    private Button buttonLogAdmin;
    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView imageView3;

    @FXML
    public void initialize() {
        imageView1.setImage(new Image(getClass().getResource("/images/01.png").toExternalForm()));
        imageView2.setImage(new Image(getClass().getResource("/images/02.png").toExternalForm()));
        imageView3.setImage(new Image(getClass().getResource("/images/03.png").toExternalForm()));
    }

    public static void setupStage(Stage stage) {
        stage.setTitle("BROKER");
        stage.setWidth(900);
        stage.setHeight(700);
    }

    @FXML
    private void handleLogUser() {
        System.out.println("Кнопка 'Войти' нажата!");
        // Добавьте нужную логику
    }

    @FXML
    private void handleRegister() {
        System.out.println("Кнопка 'Зарегистрироваться' нажата!");
        // Добавьте нужную логику
    }

    @FXML
    private void handleLogAdmin() {
        System.out.println("Кнопка 'Войти администратором' нажата!");
        // Добавьте нужную логику
    }
}