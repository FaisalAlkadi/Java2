public class Element {
	private int ID; // the id of the element
	private String info; // the info of the element
	
	// constructor
	public Element (int ID , String info) {
		this.ID = ID;
		this.info = info;
	}
	
	// copy constructor
	public Element (Element e) {
		this.ID = e.ID;
		this.info = e.info;
	}
	
	//  returns the id of the element
	public int getID () {
		return ID;
	}
	
	// returns a string representing the element
	public String toString () {
		return ("The ID for element is " + ID + " and the info apute element is " + info);
	}
}
