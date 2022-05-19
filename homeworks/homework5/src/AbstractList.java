public abstract class AbstractList implements List{
	private String name; //  the name of the list
	protected Element[] arrElement; // array of the element 
	protected int nbElement;
	
	// constructor
	public AbstractList (String name , int size) {
		this.name = name;
		arrElement = new Element[size];
		nbElement = 0;
	}
	
	// copy constructor
	public AbstractList (AbstractList a) {
		this.name = a.name;
		this.nbElement = a.nbElement;
		arrElement = new Element[a.arrElement.length];
		for (int i = 0 ; i < nbElement; i++) {
			this.arrElement[i] = a.arrElement[i];
		}
	}
	
	public String getName () {
		return name;
	}
	
	// return index from the array 
	public int search (int ID) {
		for (int i = 0 ; i < nbElement; i++) {
			if (arrElement[i].getID() == ID) {
				return i;
			}
		}
		return -1;
	}
	
	// return element by index
	public Element getElement (int index) {
		if (index >= 0 && index < nbElement) {
			return arrElement[index];
		}
		return null;
	}
	
	// print info list
	public void print() {
		System.out.println("The name of list is " + name + " and have " + arrElement + "elemnt.");
		for (int i = 0 ; i < nbElement ; i++) {
			System.out.println(arrElement[i]);
		}
	}

	// abstract methods
	public abstract boolean add (Element e);
	public abstract boolean remove (Element e); 
}
