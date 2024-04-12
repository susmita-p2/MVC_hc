package views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.PersonModel;
import model.PersonTransitionModel;

public class PersonCanEditController {

	PersonModel model;
	PersonTransitionModel transitionModel; 
	
    @FXML
    private Label descriptionLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label phoneLabel;

    @FXML
    private Label pronounsLabel;

    public void setModel(PersonModel newModel, PersonTransitionModel newTransitionModel)
    {
    	model = newModel;
    	transitionModel = newTransitionModel;
    	Bindings.bindBidirectional(nameLabel.textProperty(), model.getName());
    	Bindings.bindBidirectional(pronounsLabel.textProperty(), model.getPronouns());
    	Bindings.bindBidirectional(emailLabel.textProperty(), model.getEmail());
    	Bindings.bindBidirectional(phoneLabel.textProperty(), model.getPhone());
    	Bindings.bindBidirectional(descriptionLabel.textProperty(), model.getDescription());
    }
    @FXML
    void onFollowClick(ActionEvent event) {

    }
    
    @FXML
    void onEditClick(ActionEvent event) {
    	
    }

}
