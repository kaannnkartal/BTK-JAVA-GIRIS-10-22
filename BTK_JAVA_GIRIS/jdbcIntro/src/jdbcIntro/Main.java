package jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		

	}

	public static void selectDemo() throws SQLException {
		Connection connection = null;
		DbHelper DbH = new DbHelper();
		Statement statement = null;
		ResultSet resultSet = null;
		try {

			connection = DbH.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
			ArrayList<Country> countries = new ArrayList<Country>();
			while (resultSet.next()) {
				countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"),
						resultSet.getString("Continent"), resultSet.getString("Region")));
				// System.out.println(resultSet.getString("Name"));
			}
		} catch (SQLException Exception) {
			DbH.showErrorMessage(Exception);
		} finally {
			connection.close();
		}
	}
	
	public static void insertData() throws SQLException{
		Connection connection = null;
		DbHelper DbH = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
			connection = DbH.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, "Düzce");
			statement.setString(2, "TUR");
			statement.setString(3, "Düzce");
			statement.setInt(4, 5001);
			
			int result = statement.executeUpdate();
			System.out.println("Kayıt eklendi!");
		} catch (SQLException Exception) {
			DbH.showErrorMessage(Exception);
		} finally {
			statement.close();
			connection.close();
		}

	}
	
	public static void updateData() throws SQLException{
		Connection connection = null;
		DbHelper DbH = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			String sql = "update city set population=100000, district = 'Turkey' where id = ?";
			connection = DbH.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, 4083);
			
			int result = statement.executeUpdate();
			System.out.println("Kayıt Güncellendi!");
		} catch (SQLException Exception) {
			DbH.showErrorMessage(Exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	public static void deleteData() throws SQLException{
		Connection connection = null;
		DbHelper DbH = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			
			String sql = "delete from city where id = ?";
			connection = DbH.getConnection();
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, 4083);
			
			int result = statement.executeUpdate();
			System.out.println("Kayıt Silindi!");
		} catch (SQLException Exception) {
			DbH.showErrorMessage(Exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
}
