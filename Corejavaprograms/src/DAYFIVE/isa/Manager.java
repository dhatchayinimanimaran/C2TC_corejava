package DAYFIVE.isa;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int teamSize;

		// constructors
		public Manager() {
			super();

		}

		public Manager(String name, int employeeId, String department, int teamSize) {
			super(name, employeeId, department);
			this.teamSize = teamSize;
		}

		// getter/setter methods
		public int getTeamSize() {
			return teamSize;
		}

		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}

		@Override
		public String toString() {
			return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
					+ ", Department=" + getDepartment() + "]";
		

	}

}
