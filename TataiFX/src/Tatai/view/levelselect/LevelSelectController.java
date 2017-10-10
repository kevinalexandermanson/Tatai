package Tatai.view.levelselect;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.effects.JFXDepthManager;

import Tatai.view.game.GameController;
import Tatai.view.game.Levels;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LevelSelectController implements Initializable {
    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane topPane;

    @FXML
    private Label lblWelcome;

    @FXML
    private AnchorPane cardPane;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnPractiseEasy;
    
    @FXML
    private JFXButton btnPractiseHard;
    
    @FXML
    private JFXButton btnRealEasy;
    
    @FXML
    private JFXButton btnRealHard;

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		JFXDepthManager.setDepth(cardPane,  4);
	}
	
	@FXML
	private void btnBackHandler(ActionEvent event) throws IOException {
		Parent parentLogin = FXMLLoader.load(getClass().getResource("/Tatai/view/welcome/Login.fxml"));
		Scene sceneLogin = new Scene(parentLogin);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(sceneLogin);
	}
	
	@FXML
	private void btnPractiseEasyHandler(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Tatai/view/game/Game.fxml"));
		Parent parentGame = null;
		try {
			parentGame = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GameController controller = loader.getController();
		if (event.getSource().equals(btnPractiseEasy)) {
			controller.initialize(Levels.PractiseEasy.getNumber());
		}
		else if (event.getSource().equals(btnPractiseHard)) {
			controller.initialize(Levels.PractiseHard.getNumber());
		}
		else if (event.getSource().equals(btnRealEasy)) {
			controller.initialize(Levels.RealEasy.getNumber());
		}
		else if (event.getSource().equals(btnRealHard)) {
			controller.initialize(Levels.RealHard.getNumber());
		}

		
		Scene sceneGame = new Scene(parentGame);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(sceneGame);

		
	}
	

		

}
