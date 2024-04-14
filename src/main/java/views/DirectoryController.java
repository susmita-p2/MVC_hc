package views;

import javafx.fxml.FXML;
import model.DirectoryTransitionModel;
import model.PersonModel;
import javafx.event.ActionEvent;

public class DirectoryController {

	PersonModel model;
	DirectoryTransitionModel transitionModel;
	public void setModel(PersonModel newModel, DirectoryTransitionModel newTransitionModel) {
		model = newModel;
		transitionModel = newTransitionModel;
	}
    @FXML
    void onClickAll(ActionEvent event) {
    	transitionModel.showLinkPages();
    }

    @FXML
    void onClickMy(ActionEvent event) {

    }

}
