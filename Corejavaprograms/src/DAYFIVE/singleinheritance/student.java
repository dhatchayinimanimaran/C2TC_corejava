package DAYFIVE.singleinheritance;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int rollNo;
		private String collegeName;

		public Student() {
			super();
		}

		public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
			super(name, aadharNo, address, phno); //accessing parent class constructor
			this.rollNo = rollNo;
			this.collegeName = collegeName;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
					+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno()
					
					+ "]";
	}

}
