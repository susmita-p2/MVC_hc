package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.PersonEditController;

public class PersonTransitionModel
{
	BorderPane mainview;
	PersonModel model;
	
	public PersonTransitionModel(BorderPane view, PersonModel newModel)
	{
		mainview = view;
		model = newModel;
	}
	
	public void showEditablePerson()
	{
		FXMLLoader loader = new FXMLLoader();
		 loader.setLocation(PersonTransitionModel.class
			        .getResource("../views/PersonEditView.fxml"));
			    try {
			      Node view = loader.load();
			      mainview.setCenter(view);
			      PersonEditController cont = loader.getController();
			      cont.setModel(model);
			    } catch (IOException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }		
	}
}
