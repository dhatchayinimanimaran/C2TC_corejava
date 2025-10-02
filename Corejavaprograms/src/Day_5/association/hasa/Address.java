package Day_5.association.hasa;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String street;
		private String city;
		private String state;
		private String postalCode;

		// Constructor
		public Address() {
			super();

		}

		public Address(String street, String city, String state, String postalCode) {
			super();
			this.street = street;
			this.city = city;
			this.state = state;
			this.postalCode = postalCode;
		}

		// getter/setter methods
		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;

	}

}
