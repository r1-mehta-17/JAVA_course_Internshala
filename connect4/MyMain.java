package com.example.game;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MyMain extends Application {
    public Controller controller;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
        GridPane rootGridPane = loader.load();
        Controller controller = loader.getController();
        controller.createPlayground();
        MenuBar menuBar = createMenu();
        menuBar.prefWidthProperty().bind(stage.widthProperty());
        Pane menuPane = (Pane) rootGridPane.getChildren().get(0);
        menuPane.getChildren().add(menuBar);
        Scene scene = new Scene(rootGridPane);
        stage.setScene(scene);
        stage.setTitle("Connect4");
        stage.setResizable(false);
        stage.show();
    }

    private MenuBar createMenu() {
        Menu fileMenu = new Menu("File");
        MenuItem newGame = new MenuItem("New Game");
        newGame.setOnAction(actionEvent -> controller.resetGame());
        MenuItem resetGame = new MenuItem("Reset Game");
        resetGame.setOnAction(actionEvent -> controller.resetGame());
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem exitGame = new MenuItem("Exit Game");
        exitGame.setOnAction(actionEvent -> exitgame());
        fileMenu.getItems().addAll(newGame, resetGame, separatorMenuItem, exitGame);
        MenuBar menuBar = new MenuBar();
        Menu helpMenu = new Menu("Help");
        MenuItem aboutGame = new MenuItem("About Connect4");
        aboutGame.setOnAction(actionEvent -> aboutConnect4());
        SeparatorMenuItem separatorMenuItem1 = new SeparatorMenuItem();
        MenuItem aboutMe = new MenuItem("About Me");
        aboutMe.setOnAction(actionEvent -> aboutme());
        helpMenu.getItems().addAll(aboutGame, separatorMenuItem1, aboutMe);
        menuBar.getMenus().addAll(fileMenu, helpMenu);
        return menuBar;
    }
    private void aboutme() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About The Developer");
        alert.setHeaderText("Aarekh Mehta");
        alert.setContentText("This is the app developed by me as the training of an Internshala course in Java." + " I developed this app using JavaFX.");
        alert.show();
    }
    private void aboutConnect4() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Connect 4");
        alert.setHeaderText("How to Play?");
        alert.setContentText("Connect Four is a two-player connection game in which the players first choose a color and then take turns dropping colored discs from the top into a seven-column, six-row vertically suspended grid." + " The pieces fall straight down, occupying the next available space within the column." + " The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four of one's own discs." + " Connect Four is a solved game." + " The first player can always win by playing the right moves.");
        alert.show();
    }
    private void exitgame() {
        Platform.exit();
        System.exit(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
