import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class List2Controller
{
	@FXML
	ListView<String> list;	
		
	ObservableList<String> items = FXCollections.observableArrayList("Album B", "Album C","Album D","Back");
	final Label label = new Label();

	public List2Controller() 
	{
	}
	
	@FXML
	private void initialize() 
	{
		list.setItems(items);
		list.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<String>() {
                public void changed(ObservableValue<? extends String> ov, 
                    String old_val, String new_val) {
                        label.setText(new_val);
            }
        });	}
	@FXML
	private void close(MouseEvent event)
	{
		if(label.getText().equals("Album A"))
		{
			Stage stage = (Stage) list.getScene().getWindow();
			stage.close();
		}
		if(label.getText().equals("Back"))
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
	
}