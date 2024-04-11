package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.LoginNavigationModelInterface;
import model.SessionSingleton;
import javafx.event.ActionEvent;

public class LoginPageController {
	
	LoginNavigationModelInterface loginNavModel;
	
	public LoginPageController()
	{
		
	}
	
	public void setModel(LoginNavigationModelInterface model)
	{
		this.loginNavModel = model;
	}
	
	
    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordLabel;

    @FXML
    private TextField usernameLabel;
    
    
    
    @FXML
    void onLoginButtonClick(ActionEvent event) {
    	String username = usernameLabel.getText();
    	String password = passwordLabel.getText();
    	
    	SessionSingleton currentSession = SessionSingleton.getInstance();
    	
    	if(currentSession.startSession(username, password))
    	{
    		if(this.loginNavModel == null)
    		{
    			System.out.println("HELP");
    		}
    		this.loginNavModel.showHomepage();
    	}
    	else
    	{
    		
    	}
    	
    }
    
}
