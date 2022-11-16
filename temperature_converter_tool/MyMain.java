package com.example.game;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class MyMain extends Application {
    public static void main( String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(@NotNull Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();
        MenuBar menubar = createMenu();
        rootNode.getChildren().add(0,menubar);
        Scene scene = new Scene(rootNode, 449, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private MenuBar createMenu() {
        // File Menu
        Menu file = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        newMenuItem.setOnAction(event -> System.out.println("New menu item clicked."));
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        MenuItem closeMenuItem = new MenuItem("Close");
        closeMenuItem.setOnAction(actionEvent -> {
            Platform.exit();
            System.exit(0);
        });
        file.getItems().addAll(newMenuItem, separatorMenuItem, closeMenuItem);

        // Help Menu
        Menu help = new Menu("Help");
        MenuItem aboutMenuItem = new MenuItem("About");
        aboutMenuItem.setOnAction(actionEvent -> aboutApp());
        help.getItems().addAll(aboutMenuItem);

        // Menu Bar
        MenuBar menubar = new MenuBar();
        menubar.getMenus().addAll(file,help);
        return menubar;
    }

    private void aboutApp() {
        Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
        alertDialog.setTitle("Temperature Converter");
        alertDialog.setHeaderText("Convert temperature here.");
        alertDialog.setContentText("Convert temperature here from celsius to fahrenheit or from fahrenheit to celsius");
        ButtonType yesButton = new ButtonType("Yes");
        ButtonType noButton = new ButtonType("No");
        alertDialog.getButtonTypes().setAll(yesButton, noButton);
        Optional<ButtonType> clickedBtn = alertDialog.showAndWait();
        if(clickedBtn.isPresent() && clickedBtn.get() == yesButton) {
            System.out.println("Yes Button was clicked");
        } else {
            System.out.println("No Button was clicked");
        }
    }

    @Override
    public void stop() throws Exception {
        System.out.println("The application is closing.");
        super.stop();
    }
}
