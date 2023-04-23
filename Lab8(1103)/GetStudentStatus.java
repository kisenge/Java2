import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

class GetStudentStatus{
public static void main(String args[]) {

	if(args.length< 1)System.err.println("Usage: StudentStatus");
	String name= args[0];
	String email= args[1];
	String hsAverage= args[2];
	GetStudentStatus status = new GetStudentStatus();
	Connection conn = status.openConnection();

	try{String query = "{CALL AcceptStudent(?,?,?)}"; 
		CallableStatement stmt= conn.prepareCall(query);

		stmt.setString(1,name); // Argument 1, first ?????
		stmt.setString(2,email); // Argument 2 second ?????
		stmt.setString(3,hsAverage);// Argument 3 third ?????

		stmt.executeQuery(); // Send the request to the SQL server} catch (SQLExceptione) { // if no exception, then the record was added!S}
		} 
		catch (SQLException e) { // if no exception, then the record was added!
			System.err.println(e.getMessage());
		}
		System.out.println( "the record was added succesfully");
		

			status.closeConnection(conn);
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


