import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class BasicContactsController 
{
	@FXML
	ListView<String> list;	
		
	ObservableList<String> items = FXCollections.observableArrayList("Adam","Aidan","Amir","Becca","Brittany","Cade","Chris","Colin","Dad","Daniel","Darius","Ezekiel","Fred","Home","Issac","John","Louis");

	public BasicContactsController() 
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
	}
	
}