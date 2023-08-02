package com.example.fx_restaurantcalculator;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.fxml.FXMLLoader;

public class RestaurantCalculator extends Application {

    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage primaryStage){

        try{
            Parent root = FXMLLoader.load(getClass().getResource("RestaurantController.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Restaurant Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(Exception e){
            System.out.println("Error loading fxml");


        }
    }
}