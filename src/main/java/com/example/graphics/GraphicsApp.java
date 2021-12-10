package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GraphicsApp extends Application {

    Rectangular rect = new Rectangular();

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            // root.setCenter(createInputPane());
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Graphics App");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
