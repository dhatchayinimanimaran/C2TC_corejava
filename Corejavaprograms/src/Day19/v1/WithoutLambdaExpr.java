package Day19.v1;

public class WithoutLambdaExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
    	//without lambda, 
    	//Message implementation using anonymous class  
     
        IStatement s=new IStatement() {
        	public String show()
        	{
        		return "Welcome to Lambda Expression";
        	}};
        	
        	System.out.println(s.show());
	}

}
