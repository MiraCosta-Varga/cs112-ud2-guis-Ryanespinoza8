package cs112.ud2.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RegularUserController {

    @FXML
    private Button bookTicketButton;

    @FXML
    private Button cancelBookingButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button goBackToLoginButton;

    // Initialize method to set up any necessary data or event handlers
    @FXML
    private void initialize() {

    }

    // Event handler for Book Ticket button
    @FXML
    private void onBookTicketButtonClicked(ActionEvent event) {
        System.out.println("Book Ticket button clicked");

    }

    // Event handler for Cancel Booking button
    @FXML
    private void onCancelBookingButtonClicked(ActionEvent event) {
        System.out.println("Cancel Booking button clicked");

    }

    // Event handler for Exit button
    @FXML
    private void onExitButtonClicked(ActionEvent event) {
        System.out.println("Exit button clicked");

    }

    // Event handler for Go Back To Login button
    @FXML
    private void onGoBackToLoginButtonClicked(ActionEvent event) {
        System.out.println("Go Back To Login button clicked");

    }
}


