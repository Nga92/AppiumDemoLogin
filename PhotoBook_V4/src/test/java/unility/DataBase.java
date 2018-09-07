package unility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase {
	static Connection conn = null; 
	static Statement s = null ;
	static String value = null;
	private static String userName="root";
	private static String password="123456";

	// Should be defined as jdbc:mysql://host:port/database name
	private static String databaseURLQA = "jdbc:mysql://qahost:22020/easy";
	private static String databaseURLSTAGE = "jdbc:mysql://stagehost:2020/easyDB";
	private static String url = "jdbc:mysql://prodhost:2020/easyDB";

	public static   java.sql.Statement stm()throws SQLException  {
		 try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 conn = DriverManager.getConnection(url, userName, password);
			 System.out.println("Da ket noi CSDL");
			  s = conn.createStatement();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}
	public static String getAllValue(String sql) {
		String[][] tabArray = null;
			 ResultSet rs;
            
			try {
				rs = stm().executeQuery(sql);
				 while (rs.next()) {
					 value = rs.getString("id");
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return value; 
	}
}
