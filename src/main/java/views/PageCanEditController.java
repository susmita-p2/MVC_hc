package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.PageTransitionModel;
import model.PersonModel;

public class PageCanEditController
{
	PersonModel model;
	PageTransitionModel transition;
	public void setModel(PersonModel newModel, PageTransitionModel transitionModel) {
		model = newModel;
		transition = transitionModel;
	}
    @FXML
    private Label descriptionLabel;

    @FXML
    private Label nameLabel;
    
    @FXML
    public void onEditClick(ActionEvent event) {
    	transition.showEditable();
    }
    @FXML
    public void onFollowClick(ActionEvent event) {
    	transition.showFollowed();
    }
    @FXML
    public void onUnfollowClick(ActionEvent event) {
    	transition.showUneditable();
    }
    
    public void setModel()
    {
    	
    }
}
