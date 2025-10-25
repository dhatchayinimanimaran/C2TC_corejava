package Day11.trycatch;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in method");
		int z = 0;
		try {
			System.out.println("I am in try block");
			z = x / y;
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block: " + e.getMessage());
		}
		return z;
	}
	static float performDivision(float a, float b)
	{
		return a/b;

	}

}
