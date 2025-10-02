package DAYFIVE.multilevelinheritance.texteditor;

public class wordpad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private boolean isBold;

	    public Wordpad() {
	        super();
	        this.isBold = false;
	    }

	    public void formatText(boolean bold) {
	        if (bold) {
	            content = "<b>" + content + "</b>";
	        }
	        isBold = bold;
	    }

	    public boolean isBold() {
	        return isBold;
	}

}
