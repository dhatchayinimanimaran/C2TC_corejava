package Day8.interfaces.extendinginterfaces.funtionalinterfaces;

public class functionalinterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			GreetClass g = new GreetClass();
			System.out.println(g.greet());

			//using Lambda Expression
			GreetInterface g1 = () -> {
				return "Good Afternoon";
			};

			System.out.println(g1.greet());
	}

}
