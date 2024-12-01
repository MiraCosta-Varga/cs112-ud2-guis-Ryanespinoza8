package cs112.ud2.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LogInMenuController {

    @FXML
    private Button adminLoginButton;

    @FXML
    private Button regularLoginButton;

    @FXML
    private Button quitButton;

    // Initialize method to set up any necessary data or event handlers
    @FXML
    private void initialize() {
        // You can add any necessary initialization code here if needed
    }

    // Event handler for Admin Login button
    @FXML
    private void onAdminLoginButtonClicked(ActionEvent event) {
        System.out.println("Admin Login button clicked");
        // Add your logic to navigate to the admin login view or perform other actions
    }

    // Event handler for Regular Login button
    @FXML
    private void onRegularLoginButtonClicked(ActionEvent event) {
        System.out.println("Regular Login button clicked");
        // Add your logic to navigate to the regular login view or perform other actions
    }

    // Event handler for QUIT button
    @FXML
    private void onQuitButtonClicked(ActionEvent event) {
        System.out.println("QUIT button clicked");
        // Add your logic to quit the application or close the current window
    }
}



