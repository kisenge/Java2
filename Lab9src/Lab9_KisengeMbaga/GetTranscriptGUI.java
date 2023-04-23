import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import java.util.regex.Pattern;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import java.lang.Math;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class  GetTranscriptGUI extends Application {

private TextField idField;

private Text response;

public void start(Stage primaryStage) {
		primaryStage.setTitle("Get Student Transcript");

		Label idLabel = new Label ("Id:");


		idField = new TextField();
		idField.setPrefWidth(150);
		idField.setMaxWidth(300);

		

		Pattern pattern = Pattern.compile("\\d*|\\d+\\,\\d*");
		idField.textProperty().addListener(new ChangeListener<String>() {
	            @Override
	            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
	                if (!newValue.matches("\\d{0,3}([\\.]\\d{0,2})?")) {
	                    idField.setText(oldValue);
	                }
	            }
	        });

		Button accept = new Button("Get ID");
		accept.setOnAction(this::processGetTranscript);
		Button quit = new Button("Quit");
    quit.setOnAction(this::quitApp);

		response = new Text("");

		GridPane grid = new GridPane();
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(0, 10, 0, 10));

		// Row 1: Buttons
		grid.add(accept, 0, 0);
		grid.add(quit, 2, 0);
		//Row 2: name
		grid.add(idLabel, 0, 1);
		grid.add(idField, 1, 1);
		
		//Row 5: response
		grid.add(response, 0, 4, 2, 4);


		Scene scene = new Scene (grid, 300, 200);

		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public void processGetTranscript(ActionEvent event){
		
	String id= idField.getText();
	
	Connection conn = this.openConnection();

	try{String query = "{CALL StuTranscript(?)}"; 
		CallableStatement stmt= conn.prepareCall(query);

		stmt.setString(1,id); // Argument 1, first ?????
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
                    String row = rs.getString(1) + "\t" + rs.getString(2);
                    System.out.println(row);
		} 
		

		stmt.executeQuery(); // Send the request to the SQL server} catch (SQLExceptione) { // if no exception, then the record was added!S}
        response.setText("Success.");
		response.setFill(Color.GREEN);
    }
        
		catch (SQLException e) { // if no exception, then the record was added!
			response.setText("Your exception here");
			response.setFill(Color.RED);
            System.err.println(e.getMessage());
		}
		System.out.println( "the record was added succesfully");
		

			this.closeConnection(conn);



	
	}
	public void quitApp(ActionEvent event){
			Platform.exit();
			System.exit(0);
	}



	private Connection openConnection() {// openConnection method

	final String url= "jdbc:mysql://cs1103.cs.unb.ca:3306/kmbaga";
	final String user= "kmbaga";
	final String password= "9BX7IKsO";

	Connection conn= null;

		try {
			conn= DriverManager.getConnection(url,user, password);
		} catch(Exception e){
			System.err.printf("Couldn't open a connection: (%s)", e.getMessage());
		}
	return conn;

}


private void closeConnection(Connection conn) {// close Connection method
	try {
		conn.close();
	} catch (Exception e) {
	System.err.printf("Couldn't close connection: (%s)", e.getMessage());
	}
}

}