package resources;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BdQueries {

	public static String SQL_LAST_ID = "SELECT AUTO_INCREMENT as id \r\n"
										+ "FROM  INFORMATION_SCHEMA.TABLES\r\n"
										+ "WHERE TABLE_SCHEMA = 'templateproject' \r\n"
										+ "AND   TABLE_NAME   = 'chaines' ";
	
	public static String SQL_INSERT_CHAINE = " INSERT INTO chaines (name, chaine) \r\n " + 
			 								 " VALUES (?, ?)";
	
	public static String SQL_LIST_OF_CHAINES = " SELECT * "
												+ "FROM chaines" ;
	
	public static String SQL_CHAINE_BY_NAME = " SELECT * "
											+ "FROM chaines "
											+ "WHERE name=?" ;

	
	public static Blob loadChaine(String name) {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;

		String query = SQL_CHAINE_BY_NAME;

		PreparedStatement preparedStatement = null;

		try {

			preparedStatement = con.prepareStatement(SQL_INSERT_CHAINE);
			preparedStatement.setString(1, name);

			resultSet = preparedStatement.executeQuery(query);

			while (resultSet.next()) {

				return resultSet.getBlob("chaine");
			}
			;

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			connClass.close(con);
			connClass.close(preparedStatement);
			connClass.close(resultSet);
		}

		return null;
	}
	
	public static List<String> getListOfChaines() {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		
		String query = SQL_LIST_OF_CHAINES; 
		List<String> listOfChaines = new ArrayList<String>();
		 
		try {
			
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next()) {
				
				listOfChaines.add(resultSet.getString("name"));
			}; 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return listOfChaines;
		
	}
	
	
	public static int getLastId() {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		
		String query = SQL_LAST_ID; 
		int id = 0 ;
		try {
			
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			resultSet.next();
			id =  resultSet.getInt("id"); 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return id;
	} 
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static void insertChaine(String name, String chaine) {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {
			
			PreparedStatement preparedStatement;
			 
				preparedStatement = con.prepareStatement(SQL_INSERT_CHAINE);
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, chaine);
				preparedStatement.executeUpdate() ;
				
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	public static int queryTemplate() {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		String query = SQL_LAST_ID; 
		
		try {
			
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				// We can get by columnaname as well
				resultSet.getInt("pricePerHour");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		}

		return 0;

	}

}
