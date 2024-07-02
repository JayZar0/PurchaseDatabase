package views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * This is the main screen which is where the user can view all the data and
 * have access to adding the data and using them. This will just be used as an
 * interface application to handle all the users mouse clicks on the application.
 * @author johne
 * @version 1.0
 */
public class MainScreen implements Initializable
{
    Stage stage = new Stage();

    //FXML Variables
    @FXML
    MenuItem mnuAdd;
    @FXML
    MenuItem mnuDelete;

    //TODO add the variables and the handlers for all the sections in the application
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        mnuAdd.setOnAction(e -> {
            try
            {
                FXMLLoader loader = new FXMLLoader(MainScreen.class.getResource("NewPurchaseForm.fxml"));
                Pane addPane = loader.load();

                stage.setScene(new Scene(addPane));
                stage.setTitle("Transaction form");
                stage.showAndWait();
            }
            catch (IOException ex)
            {
                Alert obAlert = new Alert(Alert.AlertType.ERROR);
                obAlert.setTitle("Error On Adding Purchase");
                obAlert.setContentText("The program had an error while pulling up the transaction addition form");
            }
        });
    }
}
