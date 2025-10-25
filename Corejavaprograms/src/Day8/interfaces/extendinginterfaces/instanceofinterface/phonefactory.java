package Day8.interfaces.extendinginterfaces.instanceofinterface;

public class phonefactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static Phone createPhone(String company) {
			if (company.equalsIgnoreCase("Samsung"))
				return new Samsung();
			else if (company.equalsIgnoreCase("Jio"))
				return new Jio();
			return null;

	}

}
