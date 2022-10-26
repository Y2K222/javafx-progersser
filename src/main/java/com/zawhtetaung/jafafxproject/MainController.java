package com.zawhtetaung.jafafxproject;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField numberInputOne;
    @FXML
    private TextField numberInputTwo;
    @FXML
    private ComboBox<String> operations;
    @FXML
    private Label resultLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // insert operations to combobox
        operations.getItems().addAll("+", "-", "x", "/");

        // when there's a change in combobox
        operations.setOnAction(actionEvent -> {

            // get the numbers in input fields
            double numberOne = Double.parseDouble(numberInputOne.getText());
            double numberTwo = Double.parseDouble(numberInputTwo.getText());
            double result;

            // check the selected operation
            switch (operations.getValue()) {
                case "+":
                    result = numberOne + numberTwo;
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    break;
                case "x":
                    result = numberOne * numberTwo;
                    break;
                case "/":
                    result = numberOne / numberTwo;
                    break;
                default:
                    result = 0.0;
            }

            // show the result
            resultLabel.setText(String.valueOf(result));
        });
    }
}
