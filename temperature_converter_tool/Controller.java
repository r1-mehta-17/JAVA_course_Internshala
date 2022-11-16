package com.example.game;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Label welcomeLabel;

    @FXML
    public Button convertBtn;

    @FXML
    public ChoiceBox<String> choiceBox;

    @FXML
    public TextField inputTemp;

    private boolean isC_to_F = true;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().add("Celsius to Fahrenheit");
        choiceBox.getItems().add("Fahrenheit to Celsius");
        choiceBox.setValue("Celsius to Fahrenheit");
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> {
            if(t1.equals("Celsius to Fahrenheit")) {
                isC_to_F = true;
            } else {
                isC_to_F = false;
            }
        });
        convertBtn.setOnAction(actionEvent -> {
            convert();
        });
    }

    private void convert() {
        String input = inputTemp.getText();
        float temp = 0.0f;
        try {
            temp = Float.parseFloat(input);
        } catch(Exception exception) {
            warnUser();
            return;
        }
        float convertedTemp = 0.0f;
        if(isC_to_F) {
            convertedTemp = (temp * 9 / 5) + 32;
        } else {
            convertedTemp = (temp - 32) * 5 / 9;
        }
        display(convertedTemp);
    }

    private void warnUser() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Occured");
        alert.setHeaderText("INVALID TEMPERATURE ENTERED");
        alert.setContentText("Please enter a valid temperature.");
        alert.show();
    }

    private void display(float convertedTemp) {
        String unit = isC_to_F?" F":" C";
        System.out.println("The converted temperature is : " + convertedTemp + unit);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setContentText("The converted temperature is : " + convertedTemp + unit);
        alert.show();
    }
}
