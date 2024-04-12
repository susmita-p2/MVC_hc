package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.HomeBarController;
import views.LoginPageController;
import views.PersonCanEditController;

public class LoginNavigationModel implements LoginNavigationModelInterface
{
	BorderPane mainview;
	HomeTransitionModel homeTransitionModel;
	PersonModel personModel;
	PersonTransitionModel personTransitionModel;
	
	 public LoginNavigationModel(BorderPane view)
	 {
	    this.mainview = view;
	    homeTransitionModel = new HomeTransitionModel();
	    personModel = new PersonModel();
		personTransitionModel = new PersonTransitionModel();
	    
	 }
	@Override
	public void showLogin()
	{
			    FXMLLoader loader = new FXMLLoader();
			    loader.setLocation(LoginNavigationModel.class
			        .getResource("../views/LoginPage.fxml"));
			    try {
			      Pane view = loader.load();
			      mainview.setCenter(view);
			      LoginPageController cont = loader.getController();
			      cont.setModel(this);
			      
			      
			    } catch (IOException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }
	}
	
	@Override
	public void showHomepage()
	{
	    FXMLLoader homeLoader = new FXMLLoader();
	    FXMLLoader personLoader = new FXMLLoader();

	    
	    try {
	    	
	    //set top
		  homeLoader.setLocation(LoginNavigationModel.class
			      .getResource("../views/Home.fxml"));

	      Pane topBanner = homeLoader.load();
	      HomeBarController cont = homeLoader.getController();
	      cont.setModel(homeTransitionModel);
	      mainview.setTop(topBanner);
	      
	    //set center
		  personLoader.setLocation(LoginNavigationModel.class
			      .getResource("../views/PersonCanEditView.fxml"));

	      Node center = (Node)personLoader.load();
	      PersonCanEditController personCont = personLoader.getController();
	      personCont.setModel(personModel, personTransitionModel);
	      mainview.setCenter(center);
	      
	      //TODO: add controller and model
	      //TopB cont = loader.getController();
	      //cont.setModel(model);
	      
	      
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	}

}
