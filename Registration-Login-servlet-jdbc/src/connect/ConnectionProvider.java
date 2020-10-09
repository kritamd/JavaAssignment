package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {
	static Connection connection=null;
	private ConnectionProvider(){
		
	}
	
	public static Connection getConn() {
		try {
			
			if(connection==null)
			{
				
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root");
			return connection;
			
			}
			
			else
			{
				return connection;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return connection;
		
	}

}
