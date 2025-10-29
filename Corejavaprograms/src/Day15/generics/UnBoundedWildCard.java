package Day15.generics;

public class UnBoundedWildCard {
	

	public static void display(List<?> ll) {
		for (Object o : ll) {
			System.out.println(o);
		}
	}
}