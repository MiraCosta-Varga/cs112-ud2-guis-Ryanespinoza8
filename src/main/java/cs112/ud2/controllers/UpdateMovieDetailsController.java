package cs112.ud2.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class UpdateMovieDetailsController {

    @FXML
    private TextArea updateMovie1Textbox;

    @FXML
    private TextArea updateMovie2Textbox;

    @FXML
    private TextArea updateMovie3Textbox;

    @FXML
    private TextArea updateMovie4Textbox;

    @FXML
    private TextArea updateMovie5Textbox;

    @FXML
    private Button updateMovie1Button;

    @FXML
    private Button updateMovie2Button;

    @FXML
    private Button updateMovie3Button;

    @FXML
    private Button updateMovie4Button;

    @FXML
    private Button updateMovie5Button;

    @FXML
    private Button goBackButton;

    // Initialize method to set up any necessary data or event handlers
    @FXML
    private void initialize() {

    }

    // Event handler for Update Movie 1 button
    @FXML
    private void onUpdateMovie1ButtonClicked(ActionEvent event) {
        String movie1Details = updateMovie1Textbox.getText();
        System.out.println("Update Movie 1 button clicked: " + movie1Details);

    }

    // Event handler for Update Movie 2 button
    @FXML
    private void onUpdateMovie2ButtonClicked(ActionEvent event) {
        String movie2Details = updateMovie2Textbox.getText();
        System.out.println("Update Movie 2 button clicked: " + movie2Details);

    }

    // Event handler for Update Movie 3 button
    @FXML
    private void onUpdateMovie3ButtonClicked(ActionEvent event) {
        String movie3Details = updateMovie3Textbox.getText();
        System.out.println("Update Movie 3 button clicked: " + movie3Details);

    }

    // Event handler for Update Movie 4 button
    @FXML
    private void onUpdateMovie4ButtonClicked(ActionEvent event) {
        String movie4Details = updateMovie4Textbox.getText();
        System.out.println("Update Movie 4 button clicked: " + movie4Details);

    }

    // Event handler for Update Movie 5 button
    @FXML
    private void onUpdateMovie5ButtonClicked(ActionEvent event) {
        String movie5Details = updateMovie5Textbox.getText();
        System.out.println("Update Movie 5 button clicked: " + movie5Details);

    }

    // Event handler for GO BACK button
    @FXML
    private void onGoBackButtonClicked(ActionEvent event) {
        System.out.println("GO BACK button clicked");

    }
}


