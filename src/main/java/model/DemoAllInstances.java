package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DemoAllInstances
{
	ObservableList<String> allPeople;
	ObservableList<String> allCompanies;
	
	
	public DemoAllInstances()
	{
		allPeople = FXCollections.observableArrayList();
		allCompanies = FXCollections.observableArrayList();
		allPeople.add("Alice");
		allPeople.add("John Doe");
		allPeople.add("Brad Keith");	

	}
	
	public ObservableList<String> getAllPeople()
	{
		return allPeople;
	}
	public ObservableList<String> getAllCompanies()
	{
		return allCompanies;
	}
	
	public static PersonModel getPageFromId(String id)
	{
		if(id == "26")
		{
			return new PersonModel();
		}
		
		return null;
	}
}
