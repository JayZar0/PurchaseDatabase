import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URI;

/**
 * This is the main start method that will launch the application and allow
 * it to run all of its threads as well as network components.
 * @author johne
 * @version 1.0
 */
public class Start extends Application
{
    public static void main(String[] args)
    {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        // pull all the screens and place them on to the window
        FXMLLoader loader = new FXMLLoader(Start.class.getResource("MainScreen.fxml"));
        Pane mainPane = loader.load();

        // set scene
        stage.setScene(new Scene(mainPane));
        stage.setTitle("Transaction Analysis");

        // stage show
        stage.show();

        //start all the network and database dependencies here
    }
}
