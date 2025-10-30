package Day22.v1.employeedb.storedproceduresfunctions;

public class UsingStoredProcedureAndFunctions {

	public static void main(String[] args) {
		try {
			//StoredProcedureFunctionService.deleteStudents();
			//StoredProcedureFunctionService.deleteStudentsByCity("Nashik");
			
			String name=StoredProcedureFunctionService.getstudentName(2);
			System.out.println("Student name is "+name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
