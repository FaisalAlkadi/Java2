package fapplication;

public class PrintedBook extends WrittenBook {
	private int ISBN;
	private boolean hardcover;
	

	public PrintedBook(String ti, String au, int nP,int IS,boolean hardc) {
		super(ti, au, nP);
		ISBN=IS;
		hardcover=hardc;
		
	}
	public PrintedBook(String ti, String au, int nP) {
		super(ti, au, nP);
		ISBN=0;
		hardcover=false;
		
	}
	public int getISBN() {
		return ISBN;
	}
	public boolean isHardcover() {
		return hardcover;
	}
	public String toString() {
		return "PrintedBook [ISBN=" + ISBN + ", hardcover=" + hardcover + "]";
	}
	
}
