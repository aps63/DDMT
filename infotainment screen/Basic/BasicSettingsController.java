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

public class BasicSettingsController 
{
	@FXML
	ListView<String> list;	
		
	ObservableList<String> items = FXCollections.observableArrayList("Brightness","Accessibility","General","Warranty");

	public BasicSettingsController() 
	{
	}
	
	@FXML
	private void initialize() 
	{
		list.setItems(items);
	}
	@FXML
	private void openOptions(MouseEvent event)
	{
		Stage stage = (Stage) list.getScene().getWindow();
		stage.close();
		try{
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BasicOptions.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			stage = (Stage) list.getScene().getWindow();
			stage.setScene(new Scene(root));
			stage.show();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
