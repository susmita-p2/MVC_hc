package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.DirectoryTransitionModel;
import model.PersonModel;
import model.AllPagesTransitionModel;

public class AllPageTypesFlowController {
	PersonModel model;
	AllPagesTransitionModel allPagesTransitionModel;
	
    @FXML
    private Button companyPageTypeBtn;

    @FXML
    private Button jobPostingPageTypeBtn;

    @FXML
    private Button newsArticlePageTypeBtn;

    @FXML
    private Button personPageTypeBtn;

    @FXML
    private Button projectPageTypeBtn;

    @FXML
    private Button skillPageTypeBtn;

    @FXML
    void onCompanyPageClick(ActionEvent event) {

    }

    @FXML
    void onJobPostingPageClick(ActionEvent event) {

    }

    @FXML
    void onNewsArticlePageClick(ActionEvent event) {

    }

    @FXML
    void onPersonPageClick(ActionEvent event) {

    }

    @FXML
    void onProjectPageClick(ActionEvent event) {

    }

    @FXML
    void onSkillPageClick(ActionEvent event) {

    }

	public void setModel(PersonModel model, AllPagesTransitionModel allPagesTransitionModel)
	{
		this.model = model;
		this.allPagesTransitionModel = allPagesTransitionModel;
		
	}

}
