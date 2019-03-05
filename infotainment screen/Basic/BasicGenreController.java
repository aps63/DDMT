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

public class BasicGenreController 
{
	@FXML
	ListView<String> list;	
		
	ObservableList<String> items = FXCollections.observableArrayList("Pop","Rap","Rock","Alternative");
	final Label label = new Label();
	
	public BasicGenreController() 
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
		if(label.getText().equals("Pop")){
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
		
		if(label.getText().equals("Rap")){
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
		if(label.getText().equals("Rock")){
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
		if(label.getText().equals("Alternative")){
			try 
				{
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("List4.fxml"));
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