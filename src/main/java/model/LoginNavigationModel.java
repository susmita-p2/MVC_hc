package model;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.LoginPageController;

public class LoginNavigationModel implements LoginNavigationModelInterface
{
	BorderPane mainview;
	
	 public LoginNavigationModel(BorderPane view)
	 {
	    this.mainview = view;
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
	    FXMLLoader loader = new FXMLLoader();
	    
	    try {
	    	
	    //set top
		  loader.setLocation(LoginNavigationModel.class
			      .getResource("../views/Home.fxml"));

	      Pane topBanner = loader.load();
	      mainview.setTop(topBanner);

	      //TODO: add controller and model
	      //TopB cont = loader.getController();
	      //cont.setModel(model);
	      
	    //set center
		  loader.setLocation(LoginNavigationModel.class
			      .getResource("../views/PageEditView.fxml"));

	      Pane center = loader.load();
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
