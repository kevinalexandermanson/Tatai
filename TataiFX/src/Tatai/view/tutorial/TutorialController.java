package Tatai.view.tutorial;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.effects.JFXDepthManager;

import Tatai.view.welcome.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TutorialController implements Initializable {
	@FXML
    private AnchorPane root;

    @FXML
    private AnchorPane topPane;

    @FXML
    private Label lblHowToPlay;

    @FXML
    private Label lblUser;

    @FXML
    private AnchorPane cardPane;

    @FXML
    private AnchorPane buttonPane;

    @FXML
    private JFXButton btnGameBasics;

    @FXML
    private JFXButton btnPracticeMode;

    @FXML
    private JFXButton btnMathsMode;

    @FXML
    private JFXButton btnAboutTatai;

    @FXML
    private JFXButton btnBack;

    @FXML
    private ImageView image;


	/**
	 * Initializes the buttons on the screen
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		lblUser.setText("Logged in as: " + LoginController.getCurrentPlayer());
		JFXDepthManager.setDepth(cardPane,  4);
		JFXDepthManager.setDepth(topPane, 5);
		Image selectMode = new Image(getClass().getResourceAsStream("/Tatai/resources/SelectMode.PNG"));
		image.setImage(selectMode);
		
	}
	
	/**
	 * Handles the back button
	 * @param event
	 * @throws IOException
	 */
	@FXML
	private void btnBackHandler(ActionEvent event) throws IOException {
		Parent parentLevelSelect = FXMLLoader.load(getClass().getResource("/Tatai/view/levelselect/LevelSelect.fxml"));
		Scene sceneLevelSelect = new Scene(parentLevelSelect);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(sceneLevelSelect);


	}
	
	@FXML
	private void btnModeHandler(ActionEvent event) throws IOException {


	}
	
	

}

