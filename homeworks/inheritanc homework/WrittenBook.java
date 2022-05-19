package fapplication;

public class WrittenBook extends Book{
	private int nPages;

	public WrittenBook(String ti, String au,int nP) {
		super(ti, au);
		nPages=nP;
	}

	public int getnPages() {
		return nPages;
	}

	public String toString() {
		return "WrittenBook [nPages=" + nPages + "]";
	}
	

}
