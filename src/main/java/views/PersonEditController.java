package views;

//import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.PersonModel;

public class PersonEditController {

	PersonModel model;
    @FXML
    private TextArea descriptionField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField idField;

    @FXML
    private ChoiceBox<?> linksChoices;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField pronounsField;

    @FXML
    void onAddLinkClick(ActionEvent event) {

    }
    public void setModel(PersonModel newModel)
    {
    	model = newModel;
   
    }

    @FXML
    void onCancelClick(ActionEvent event) {

    }

    @FXML
    void onUpdateClick(ActionEvent event) {

    }

}
