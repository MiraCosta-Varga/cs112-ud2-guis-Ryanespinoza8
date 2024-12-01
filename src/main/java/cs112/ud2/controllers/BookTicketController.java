package cs112.ud2.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BookTicketController {

    @FXML
    private Button bookSeatsForMovie1Button;

    @FXML
    private Button bookSeatsForMovie2Button;

    @FXML
    private Button bookSeatsForMovie3Button;

    @FXML
    private Button bookSeatsForMovie4Button;

    @FXML
    private Button bookSeatsForMovie5Button;

    @FXML
    private Button goBackButton;

    // Initialize method to set up any necessary data or event handlers
    @FXML
    private void initialize() {
        // You can add any necessary initialization code here if needed
    }

    // Event handler for Book Seats for Movie 1 button
    @FXML
    private void onBookSeatsForMovie1Clicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 1 button clicked");
        // Add your logic to book seats for Movie 1 or navigate to the booking view
    }

    // Event handler for Book Seats for Movie 2 button
    @FXML
    private void onBookSeatsForMovie2ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 2 button clicked");
        // Add your logic to book seats for Movie 2 or navigate to the booking view
    }

    // Event handler for Book Seats for Movie 3 button
    @FXML
    private void onBookSeatsForMovie3ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 3 button clicked");
        // Add your logic to book seats for Movie 3 or navigate to the booking view
    }

    // Event handler for Book Seats for Movie 4 button
    @FXML
    private void onBookSeatsForMovie4ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 4 button clicked");
        // Add your logic to book seats for Movie 4 or navigate to the booking view
    }

    // Event handler for Book Seats for Movie 5 button
    @FXML
    private void onBookSeatsForMovie5ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 5 button clicked");
        // Add your logic to book seats for Movie 5 or navigate to the booking view
    }

    // Event handler for GO BACK button
    @FXML
    private void onGoBackButtonClicked(ActionEvent event) {
        System.out.println("GO BACK button clicked");
        // Add your logic to navigate back to the previous view or perform other actions
    }
}


