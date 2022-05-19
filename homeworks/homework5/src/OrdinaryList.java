public class OrdinaryList extends AbstractList{
	public OrdinaryList (String name , int size) {
		super(name ,size);
	}
	
	public OrdinaryList (OrdinaryList u) {
		super(u);
	}
	
	public int count (int id) {
		int c = 0;
		for (int i = 0 ; i < nbElement ; i++) {
			if (arrElement[i].getID() == id) {
				c++;
			}
		}
		return c;
	}

	@Override
	public boolean add(Element e) {
		if (nbElement < arrElement.length) {
			arrElement[nbElement++] = new Element(e);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Element e) {
		int index = search(e.getID());
		if (index != -1) {
			arrElement[index] = arrElement[nbElement - 1];
			nbElement--;
		}
		return false;
	}
}
