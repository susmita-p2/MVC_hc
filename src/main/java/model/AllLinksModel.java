package model;

import javafx.collections.ObservableList;
import javafx.scene.layout.BorderPane;

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

	
}
