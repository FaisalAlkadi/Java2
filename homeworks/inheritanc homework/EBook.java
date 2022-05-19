package fapplication;

public class EBook extends WrittenBook{
	private int size;

	public EBook(String ti, String au, int nP, int size) {
		super(ti, au, nP);
		this.size=size;
		
	}

	public int getSize() {
		return size;
	}
	public PrintedBook print(){
		
		PrintedBook pr=new PrintedBook(getTitle(),getAuthor(),getnPages());
		return pr;	
	}
	public String toString() {
		return "EBook [size=" + size + "]";
	}
	

}
