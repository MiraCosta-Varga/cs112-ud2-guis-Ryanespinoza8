package cs112.ud2.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CancelBookingController {

    @FXML
    private Button cancelSeatsForMovie1Button;

    @FXML
    private Button cancelSeatsForMovie2Button;

    @FXML
    private Button cancelSeatsForMovie3Button;

    @FXML
    private Button cancelSeatsForMovie4Button;

    @FXML
    private Button cancelSeatsForMovie5Button;

    @FXML
    private Button goBackButton;

    // Initialize method to set up any necessary data or event handlers
    @FXML
    private void initialize() {

    }

    // Event handler for Cancel Seats for Movie 1 button
    @FXML
    private void onCancelSeatsForMovie1Button(ActionEvent event) {
        System.out.println("Cancel Seats for Movie 1 button clicked");

    }

    // Event handler for Cancel Seats for Movie 2 button
    @FXML
    private void onCancelSeatsForMovie2ButtonClicked(ActionEvent event) {
        System.out.println("Cancel Seats for Movie 2 button clicked");

    }

    // Event handler for Cancel Seats for Movie 3 button
    @FXML
    private void onCancelSeatsForMovie3ButtonClicked(ActionEvent event) {
        System.out.println("Cancel Seats for Movie 3 button clicked");

    }

    // Event handler for Cancel Seats for Movie 4 button
    @FXML
    private void cancelSeatsForMovie4ButtonClicked(ActionEvent event) {
        System.out.println("Cancel Seats for Movie 4 button clicked");

    }

    // Event handler for Cancel Seats for Movie 5 button
    @FXML
    private void onCancelSeatsForMovie5ButtonClicked(ActionEvent event) {
        System.out.println("Cancel Seats for Movie 5 button clicked");

    }

    // Event handler for GO BACK button
    @FXML
    private void onGoBackButtonClicked(ActionEvent event) {
        System.out.println("GO BACK button clicked");

    }
}


