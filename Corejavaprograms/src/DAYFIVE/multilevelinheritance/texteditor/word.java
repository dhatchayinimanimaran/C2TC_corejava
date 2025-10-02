package DAYFIVE.multilevelinheritance.texteditor;

public class word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protected String content;

	    public Notepad() {
	        this.content = "";
	    }

	    public void write(String text) {
	        content += text; //content = content+text
	    }

	    public void displayContent() {
	        System.out.println("Notepad Content: " + content);
	    }
	    
	    
	    /*
	     * returntype funcName()
	     * {
	     * 		//statement
	}

}
