package resources;

import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BdQueries {

	public static String SQL_LAST_ID = "SELECT AUTO_INCREMENT as id \r\n"
										+ "FROM  INFORMATION_SCHEMA.TABLES\r\n"
										+ "WHERE TABLE_SCHEMA = 'templateproject' \r\n"
										+ "AND   TABLE_NAME   = 'chaines' ";
	
	public static String SQL_INSERT_CHAINE = " INSERT INTO chaines (name, chaine) \r\n " + 
			 								 " VALUES (?, ?)" ;
	
	public static String SQL_UPDATE_CHAINE_BY_ID = " UPDATE chaines  " + 
			 									"SET chaine = ?" +
			 									"WHERE id = ?";
	
	public static String SQL_UPDATE_CHAINE_BY_NAME = " UPDATE chaines  " + 
													"SET chaine = ?" +
													"WHERE name = ? AND isDeleted = 0";
	
	public static String SQL_LIST_OF_CHAINES = " SELECT * "
												+ "FROM chaines "
												+ "WHERE isDeleted = 0" ;
	
	public static String SQL_CHAINE_BY_ID = " SELECT * "
											+ "FROM chaines "
											+ "WHERE id=? AND isDeleted = 0" ;

	public static String SQL_ALL_CHAINE = " SELECT * "
										+ "FROM chaines "
										+ "WHERE isDeleted = 0"; 

	public static String SQL_CHAINE_BY_NAME = " SELECT * "
											+ "FROM chaines "
											+ "WHERE name=? AND isDeleted = 0" ;
	
	public static String SQL_DELETE_CHAINE = " UPDATE chaines  " + 
											"SET isDeleted = 1 " +
											"WHERE id = ? AND isDeleted = 0";
	
	
	public static void deleteChaine(int key) {
		 
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_DELETE_CHAINE);
			preparedStatement.setInt(1, key); 
			
			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate();

		} catch (Exception  e) { 
			 
			 e.printStackTrace() ;
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static void UpdateChaine(int id, String chaine, File file) {
 
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_UPDATE_CHAINE_BY_ID);
			preparedStatement.setString(1, chaine);
			preparedStatement.setInt(2, id); 
			
			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate(); 
			
			file.delete();
			
		} catch (Exception  e) { 
			 
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static void UpdateChaineByName(File file, String chaine) {
 
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_UPDATE_CHAINE_BY_NAME);
			preparedStatement.setString(1, chaine);
			preparedStatement.setString(2, file.getName()); 
			
			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate(); 
			
			file.delete();
			
		} catch (Exception  e) { 
			 
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static List<Chaine> loadALLChaine() {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null; 

		PreparedStatement preparedStatement = null;

		List<Chaine> listBlob = new ArrayList<Chaine>();
		
		try {

			preparedStatement = con.prepareStatement(SQL_ALL_CHAINE); 

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				listBlob.add(new Chaine(resultSet.getBlob("chaine"), resultSet.getString("name")));
			} 

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			connClass.close(con);
			connClass.close(preparedStatement);
			connClass.close(resultSet);
		}

		return listBlob;
	}
	
	
	public static Blob loadChaine(int id) {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null; 

		PreparedStatement preparedStatement = null;

		try {

			preparedStatement = con.prepareStatement(SQL_CHAINE_BY_ID);
			preparedStatement.setInt(1, id);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				return resultSet.getBlob("chaine");
			} 

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			connClass.close(con);
			connClass.close(preparedStatement);
			connClass.close(resultSet);
		}

		return null;
	}
	
	
	public static List<ComboItem> getListOfChaines() {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		
		String query = SQL_LIST_OF_CHAINES; 
		List<ComboItem> listOfChaines = new ArrayList<ComboItem>();
		 
		try {
			
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next()) {
				
				listOfChaines.add(new ComboItem(resultSet.getInt("id"),  resultSet.getString("name")));
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
	public static int insertChaine(File file, String chaine) {
 
		if (isChaineExist(file.getName())) {
			UpdateChaineByName(file, chaine);
			
			return 0;
		} else { 
			
			ConnectionClass connClass = new ConnectionClass();
			Connection con = connClass.getFileFromResources();
			ResultSet resultSet = null;
			Statement statement = null; 
			 
			try {
	
				PreparedStatement preparedStatement;
	
				preparedStatement = con.prepareStatement(SQL_INSERT_CHAINE);
				preparedStatement.setString(1, file.getName());
				preparedStatement.setString(2, chaine); 
				
				// on duplicate chaine with the same name throw exception 
				preparedStatement.executeUpdate();
				 
			    if (file.delete()) { 
			        System.out.println("Deleted the file: " + file.getName());
			      } else {
			        System.out.println("Failed to delete the file.");
			      } 
			    
				return getLastId() - 1;
	//			int last_inserted_id = 0;
	//
	//			ResultSet rs = preparedStatement.getGeneratedKeys();
	//			if (rs.next()) {
	//				last_inserted_id = rs.getInt(1);
	//			}
	//
	//			return last_inserted_id;
				
			} catch (Exception  e) { 
				 
				return 0;
				
			} finally {
				connClass.close(con);
				connClass.close(statement);
				connClass.close(resultSet);
			}
		}
	}
	
	public static boolean isChaineExist(String name) {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null;  
		
		try {
			PreparedStatement preparedStatement;
			preparedStatement = con.prepareStatement(SQL_CHAINE_BY_NAME);
			preparedStatement.setString(1, name);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				return true;
			} 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		}

		return false;

	}



}
