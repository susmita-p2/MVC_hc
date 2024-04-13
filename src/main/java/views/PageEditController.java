package views;

import javafx.event.ActionEvent;
import model.PageTransitionModel;
import model.PersonModel;

public class PageEditController{
	PersonModel model;
	PageTransitionModel transitionModel;
	public void setModel(PersonModel newModel, PageTransitionModel transition) {
		model = newModel;
		transitionModel = transition;
	}
    public void onUpdateClick(ActionEvent event) {
    	transitionModel.showUneditable();
    }
    public void onCancelClick(ActionEvent event) {
    	transitionModel.showUneditable();
    }
}
