package Day8.abstraction;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protected float area;
	    
	    //abstract method 
		 abstract void calArea();
		 
		 //concrete method
		 void show()
		 {
			 System.out.println("Area of shape is "+area);

	}

}
