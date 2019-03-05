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
import javafx.beans.value.ObservableValue;

public class BasicArtistController 
{
	@FXML
	ListView<String> list;	
		
	ObservableList<String> items = FXCollections.observableArrayList("Artist 1","Artist 2","Artist 3");
	final Label label = new Label();
	
	public BasicArtistController() 
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
        });
	}
	@FXML
	private void close(MouseEvent event)
	{
		Stage stage = (Stage) list.getScene().getWindow();
		stage.close();
		if(label.getText().equals("Artist 1")){
			try 
				{
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("List2.fxml"));
					Parent root = (Parent) fxmlLoader.load();
					stage = new Stage();
					stage.setScene(new Scene(root));  
					stage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		if(label.getText().equals("Artist 2")){
			try 
				{
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("List1.fxml"));
					Parent root = (Parent) fxmlLoader.load();
					stage = new Stage();
					stage.setScene(new Scene(root));  
					stage.show();
				} catch(Exception e) {
					e.printStackTrace();
				}
		}
		if(label.getText().equals("Artist 3")){
			try 
				{
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("List3.fxml"));
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