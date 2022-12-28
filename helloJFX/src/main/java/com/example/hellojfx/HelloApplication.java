package com.example.hellojfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Programa totalmente seguro");
        stage.setHeight(500);
        stage.setWidth(500);
        Scene scene = new Scene(root, Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}