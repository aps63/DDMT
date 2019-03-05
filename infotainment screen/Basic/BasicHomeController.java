import javafx.fxml.FXML;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
public class BasicHomeController 
{
	@FXML
	private Button phone;
	@FXML
	private Button maps;
	@FXML
	private Button settings;
	@FXML
	private Button music;
	@FXML
	private Button messages;	
	@FXML
	ButtonType ButtonTypeOne = new ButtonType("Thanks!");
	@FXML
	ButtonType ButtonTypeTwo = new ButtonType("Sorry I'm Driving now");
	@FXML
	ButtonType ButtonTypeThree = new ButtonType("I'll call you soon");

	public BasicHomeController() 
	{
	}
	
	@FXML
	private void initialize() 
	{
	}
	
	@FXML
	public void DisplayContacts(ActionEvent event)
	{               
		
		try 
		{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BasicContacts.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));  
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
      }
	}
	
	@FXML
	public void DisplayEntertainment(ActionEvent event)
	{               
		try 
		{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BasicEntertainment1.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));  
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
      }
	}
	
	@FXML
	public void SettingsMenu(ActionEvent event)
	{
		try 
		{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BasicSettings.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));  
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
      }
	}
	@FXML
	private void RecieveText(ActionEvent event)
	{
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "You have 1 new message, would you like to view?",ButtonType.YES,ButtonType.NO);
		alert.showAndWait();
		if (alert.getResult() == ButtonType.YES) 
		{
			alert = new Alert(Alert.AlertType.INFORMATION, "From Karen: Hi user, This is a distracting text message. Did you know distracted driving is responsible for 10 percent of fatal crashes in the US each year? ", ButtonTypeOne, ButtonTypeTwo,ButtonTypeThree);
			alert.showAndWait();
		}
	}
}