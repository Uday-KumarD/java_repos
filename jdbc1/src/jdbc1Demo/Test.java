package jdbc1Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// loading the driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		// getting the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sept", "root", "100502");
		
		// create statement
		Statement stmt = conn.createStatement(); // to write queries
		
		// execute the statement
		//boolean result = stmt.execute("create table institute(iid int,iname varchar(20),iadd varchar(30))");
//		int result = stmt.executeUpdate("insert into institute values(113,'uday','hyd')");
		
//		ResultSet result = stmt.executeQuery("select*from institute");
//		
//		while(result.next())
//		{
//			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
//		}
		
//		int result = stmt.executeUpdate("update institute set iadd = 'kphb' where iid='113'");
		
		int result = stmt.executeUpdate("delete from institute where iid = 113");
		
		// close the connection
		conn.close();
//		System.out.println("table is created :"+result);
		System.out.println("record is inserted:"+result);
	}
	
			
}
