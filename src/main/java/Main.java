import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @class Main
 * @brief Entry point for the JinMarket JavaFX application.
 * 
 * The Main class extends the Application class to initialize and launch
 * the JavaFX user interface. It sets up the primary stage and loads the
 * FXML file to display the main view.
 */
public class Main extends Application {

    /**
     * @brief Starts the JavaFX application.
     * 
     * This method is called by the JavaFX runtime to initialize the primary stage
     * and display the main user interface.
     * 
     * @param primaryStage The primary stage for this application.
     * @throws Exception if there is an error loading the FXML file.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the main FXML file
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainView.fxml"));

        // Create a scene and set it on the stage
        Scene scene = new Scene(root);
        primaryStage.setTitle("JinMarket");
        primaryStage.setScene(scene);

        // Show the primary stage
        primaryStage.show();
    }

    /**
     * @brief The main entry point of the application.
     * 
     * Calls the JavaFX `launch` method to start the application.
     * 
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        launch(args); // Start the JavaFX application
    }
}
