package com.alex.home.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

/**
 * @author Oleksandr Ivanov
 */
public class SampleController {

    @FXML
    private Text actionTarget;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actionTarget.setText(String.format("Pressed with password: %s", passwordField.getText()));
    }
}
