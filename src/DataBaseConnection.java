
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.*;

public class DataBaseConnection {

	
	public void testDB() throws ClassNotFoundException, SQLException
	{
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username","password");
	
	Statement sql = (Statement) con.createStatement();
	
	ResultSet rs = (ResultSet) sql.executeQuery("Select * from Employee");
	
	while(rs.next())
	{
	
		String ColumnName = rs.getString("ColumName");
		System.out.println("Database record is "+ColumnName);

	
	}
	
	}	
}
