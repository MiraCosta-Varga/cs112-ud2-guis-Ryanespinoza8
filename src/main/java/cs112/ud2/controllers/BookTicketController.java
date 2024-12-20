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

    }

    // Event handler for Book Seats for Movie 1 button
    @FXML
    private void onBookSeatsForMovie1Clicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 1 button clicked");

    }

    // Event handler for Book Seats for Movie 2 button
    @FXML
    private void onBookSeatsForMovie2ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 2 button clicked");

    }

    // Event handler for Book Seats for Movie 3 button
    @FXML
    private void onBookSeatsForMovie3ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 3 button clicked");

    }

    // Event handler for Book Seats for Movie 4 button
    @FXML
    private void onBookSeatsForMovie4ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 4 button clicked");

    }

    // Event handler for Book Seats for Movie 5 button
    @FXML
    private void onBookSeatsForMovie5ButtonClicked(ActionEvent event) {
        System.out.println("Book Seats for Movie 5 button clicked");

    }

    // Event handler for GO BACK button
    @FXML
    private void onGoBackButtonClicked(ActionEvent event) {
        System.out.println("GO BACK button clicked");

    }
}


