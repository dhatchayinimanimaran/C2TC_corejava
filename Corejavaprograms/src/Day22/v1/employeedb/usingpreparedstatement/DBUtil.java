package Day22.v1.employeedb.usingpreparedstatement;

public class DBUtil {
	private static Connection con;
		
	static
	{		
		try {
			//Step 1. load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
			
			//Step 2. Establish the connection with database
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbn08","root","alpana@123");
			System.out.println("Connection established successfully....");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static Connection getCn()
	{
		return con;
	}
	
	
}
