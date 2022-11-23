package com.example.javafxfinalprojectbasdat;

import com.example.javafxfinalprojectbasdat.repository.Repository;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(Repository.getAllInstructor());
    }
}