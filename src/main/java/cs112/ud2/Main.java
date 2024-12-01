package cs112.ud2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("adminUser-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("bookTicket-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("cancelBooking-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("logInMenu-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("regularUser-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 400, 600);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("updateMovieDetails-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 600);

        stage.setTitle("Hello!");  // Set the window title
        stage.setScene(scene);     // Set the scene on the stage
        stage.show();              // Display the stage
    }

    public static void main(String[] args) {
        launch();  // Launch the JavaFX application
    }
}