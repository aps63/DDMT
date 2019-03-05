import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
public class BasicEntertainmentController1 
{
	@FXML
	ListView<String> list;	
		
	ObservableList<String> items = FXCollections.observableArrayList("Radio","Music","Podcasts","Sirius XM","CD");

	public BasicEntertainmentController1() 
	{
	}
	
	@FXML
	private void initialize() 
	{
		list.setItems(items);
	}
	@FXML
	private void close(MouseEvent event)
	{
		Stage stage = (Stage) list.getScene().getWindow();
		stage.close();
		try 
			{
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BasicEntertainment2.fxml"));
				Parent root = (Parent) fxmlLoader.load();
				stage = new Stage();
				stage.setScene(new Scene(root));  
				stage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	
}