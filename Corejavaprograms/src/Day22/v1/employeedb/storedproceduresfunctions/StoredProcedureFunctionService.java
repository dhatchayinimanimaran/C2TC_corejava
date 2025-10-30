package Day22.v1.employeedb.storedproceduresfunctions;

public class StoredProcedureFunctionService {
	static Connection con;
	static Statement st;
	static PreparedStatement pst;
	static CallableStatement cst;
	static 
	{
		con=DBUtil.getCn();
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteStudents() throws SQLException
	{
		boolean result=st.execute("call deleteStudent()");
		if (!result) // result==false
		{
			System.out.println(st.getUpdateCount()+" record(s) Deleted");
		}		
	}
	
	public static void deleteStudentsByCity(String city) throws SQLException
	{
		//boolean result=st.execute("call deleteStudentBycity('"+city+"')"); //static query
		pst=con.prepareStatement("call deleteStudentBycity(?)"); //dynamic query
		pst.setString(1, city);
		boolean result=pst.execute();
		if (!result) // result==false
		{
			System.out.println(pst.getUpdateCount()+" record(s) Deleted");
		}		
	}
	
	public static String getstudentName(int id) throws SQLException
	{
		cst=con.prepareCall("{? = call getStudentNameById(?)}");
		cst.setInt(2, id);
		cst.registerOutParameter(1, Types.VARCHAR);
		cst.execute();
		String name=cst.getString(1);
		return name;
	}
	
}
