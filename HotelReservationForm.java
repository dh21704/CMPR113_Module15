/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Danny
 */
public class HotelReservationForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hotel App");
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setStyle("-fx-background-color: #ADD8E6");
        
        Image hotelImage = new Image("file:C:/Users/Danny/Downloads/the-anaheim-hotel.jpg");
        ImageView imageView = new ImageView(hotelImage);
        
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        
        grid.add(imageView, 0, 0, 2, 1);
        
        Label lblName = new Label("Name:");
        grid.add(lblName, 0, 1);
        
        TextField txtName = createSytledTextField();
        grid.add(txtName, 1, 1);
        
        Label lblAddress = new Label("Address:");
        grid.add(lblAddress, 0, 2);
        TextField txtAddress = createStyledTextField();
        grid.add(txtAddress, 1, 2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
