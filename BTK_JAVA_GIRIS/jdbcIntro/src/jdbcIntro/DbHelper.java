package jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

	private String userName = "root";

	private String password = "12345";
	private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbUrl,userName,password);
	}
	
	public void showErrorMessage(SQLException Exception) {
		
		System.out.println("Error : " + Exception.getMessage());
		System.out.println("Error Code : " + Exception.getErrorCode());
	}
}
