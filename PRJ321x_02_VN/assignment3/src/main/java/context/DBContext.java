package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
	public Connection getConnection() throws Exception{
		String url = "jdbc:sqlserver://"+serverName+":"+portNumber+"\\"+instance+";databaseName="+dbName+";encrypt=true;trustServerCertificate=true";
		if(instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://"+serverName+":"+portNumber+";databaseName="+dbName+";encrypt=true;trustServerCertificate=true";
//		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url,userID, passWord);
	}
	
	private final String serverName ="HOAITHANH\\MSSQLSERVER01";
	private final String dbName = "ShoppingDB";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID ="sa";
	private final String passWord ="sa";
	
//	public static void main(String[] args) {
//
//		try {
//			System.out.println(new DBContext().getConnection());
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("error");
//			e.printStackTrace();
//		}
//	}
}
