package model;


import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import views.DirectoryController;


public class DirectoryTransitionModel 
{
	BorderPane mainview;
	PersonModel model;
	public DirectoryTransitionModel(BorderPane view, PersonModel newModel) {
		model = newModel;
		mainview = view;
	}
	
	public void showLinkPages()
	{
		FXMLLoader loader = new FXMLLoader();
		 loader.setLocation(PersonTransitionModel.class
			        .getResource("../views/AllPageTypesFlowView.fxml"));
			    try {
			      Node view = loader.load();
			      mainview.setCenter(view);
			      DirectoryController cont = loader.getController();
			      cont.setModel(model,this);
			    } catch (IOException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }
	}
	
}
