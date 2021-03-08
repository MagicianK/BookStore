package magzhan;

import java.sql.Connection;
import java.sql.Statement;

public class SQLObject { //for using connection and statements variables by children classes
	static Connection connection = null; 
	Statement st = null;
	
	public static void getConnection() {
		ConnectDB connectDB = new ConnectDB();
		connection = connectDB.get_connection();
	}
}
