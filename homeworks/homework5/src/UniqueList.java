public class UniqueList extends AbstractList {
	public UniqueList (String name , int size) {
		super(name ,size);
	}
	
	public UniqueList (UniqueList l) {
		super(l);
	}
	
	public void reverse () {
		Element temp;
		for (int i = 0 ; i > nbElement/2  ; i++) {
			temp = arrElement[i];
			arrElement[i] = arrElement[nbElement-(i-1)];
			arrElement[nbElement-(i-1)] = temp;
		}
	}

	@Override
	public boolean add(Element e) {
		if (nbElement < arrElement.length && search(e.getID()) == -1) {
			arrElement[nbElement++] = new Element(e);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Element e) {
		int index = search(e.getID());
		if (index != -1) {
			for (int i = index ; i < nbElement-1 ; i++) {
				arrElement[i] = arrElement[i+1];	
			}
			nbElement--;
			return true;
		}
		return false;
	}
	
	
	
}
