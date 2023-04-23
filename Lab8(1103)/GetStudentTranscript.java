import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;


class GetStudentTranscript{
public static void main(String args[]) {

	if(args.length< 1)System.err.println("Usage: StudentTranscript");
	String studentId= args[0];
	
	GetStudentTranscript transcript = new GetStudentTranscript();
	Connection conn = transcript.openConnection();

	try{String query = "{CALL StudentTranscript(?)}"; 
		CallableStatement stmt= conn.prepareCall(query);

		stmt.setString(1,studentId); // Argument 1, first ?????
		

		stmt.executeQuery(); // Send the request to the SQL server} catch (SQLExceptione) { // if no exception, then the record was added!S}
		} 
		catch (SQLException e) { // if no exception, then the record was added!
			System.err.println(e.getMessage());
		}
		System.out.println( "Here are the records");
		
			transcript.closeConnection(conn);
}


private Connection openConnection() {// openConnection method

	final String url= "jdbc:mysql://cs1103.cs.unb.cs:3306/kmbaga";
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



