package Day7.v1;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private double side;

		// Constructor for Square
		public Square(double side) {
			this.side = side;
		}

		// Override draw method for Square
		@Override
		public void draw() {
			System.out.println("Drawing a square with side " + side);
		}

		// Override erase method for Square
		@Override
		public void erase() {
			System.out.println("Erasing a square with side " + side);

	}

}
