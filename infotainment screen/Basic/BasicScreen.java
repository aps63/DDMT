import javafx.fxml.FXML;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BasicScreen extends Application
{
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	static Stage stg;
	@Override
	public void start(Stage stage) throws IOException 
	{
		this.stg = stage;
		Parent root = FXMLLoader.load(getClass().getResource("BasicHome.fxml"));
		stage.setTitle("Basic Screen");
		stage.setScene(new Scene(root,1000,600));
		stage.show();
	}
}