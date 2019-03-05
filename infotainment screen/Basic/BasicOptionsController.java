import javafx.fxml.FXML;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class BasicOptionsController 
{
	@FXML
	ChoiceBox lock;
	
	@FXML
	CheckBox reset;
	
	@FXML
	ChoiceBox paired;
		
	ObservableList<String> pair_choices = FXCollections.observableArrayList("iPhone","Pixel","Galaxy S9","John's phone");
	ObservableList<String> screen_choices = FXCollections.observableArrayList("Disabled","Enable");

	public BasicOptionsController() 
	{
	}
	
	@FXML
	private void initialize() 
	{
		lock.setItems(screen_choices);
		paired.setItems(pair_choices);
	}
	
	@FXML
	private void DisplayWarning(ActionEvent event)
	{
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "ARE YOU SURE YOU WANT TO RESET THE SYSTEM?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
		alert.showAndWait();
		if (alert.getResult() == ButtonType.YES) 
		{
			Stage stage = (Stage)paired.getScene().getWindow();
			stage.close();
		}
	}
	
}
