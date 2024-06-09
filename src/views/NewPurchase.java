package views;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class will be used to control the new purchase screen when the user
 * wants to add a purchase into the database. It will prompt the type of purchase
 * and the amount they paid.
 * @author johne
 * @version 1.0
 */
public class NewPurchase implements Initializable
{
    //FXML variables
    @FXML
    private TextField txtAmount;
    @FXML
    private ComboBox<String> cboType;
    @FXML
    private Button cmdClear;
    @FXML
    private Button cmdConfirm;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        //combo box items
        cboType.getItems().addAll("Debit", "Mastercard", "Visa", "American Express");

        cmdClear.setOnAction(e -> {
            //clear all the fields in the form
            txtAmount.clear();
            cboType.setValue("");
        });

        cmdConfirm.setOnAction(e -> {
            //add items into the database
        });
    }
}
