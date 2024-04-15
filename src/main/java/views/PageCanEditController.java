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
    public void onClickEdit(ActionEvent event) {
    	transition.showEditable();
    }
    @FXML
    public void onClickFollow(ActionEvent event) {
    	transition.showFollowed();
    }
    @FXML
    public void onClickUnfollow(ActionEvent event) {
    	transition.showUneditable();
    }
    
    public void setModel()
    {
    	
    }
}
