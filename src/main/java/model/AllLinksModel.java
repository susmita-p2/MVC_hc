package model;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.LoginPageController;
import views.PageCanEditController;

public class AllLinksModel {
	
	BorderPane mainview;
	PersonModel model;
	
	AllLinksModel(BorderPane mainview, PersonModel model)
	{
		this.mainview = mainview;
		this.model = model; //in the future this is the page that we want
	}

	public ObservableList<String> getLinks(String link)
	{
		DemoAllInstances storageDemo = new DemoAllInstances();
		System.out.println( storageDemo.getAllLinks(this.model.getId().getValue(), link));
		return storageDemo.getAllLinks(this.model.getId().getValue(), link);
	}
	
	//TODO delete this!
	public void showAmazon()
	{
	    FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(LoginNavigationModel.class
	        .getResource("../views/PageCanEdit.fxml"));
	    try {
	      Pane view = loader.load();
	      mainview.setCenter(view);
	      PageCanEditController cont = loader.getController();
	      cont.setModel();
	      
	      
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }


	}
}
