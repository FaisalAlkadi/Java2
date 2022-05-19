public class Collection {
	private String name;
	private AbstractList Lists[];
	private int nbLists;
	
	public Collection (String name , int size) {
		this.name = name;
		Lists = new AbstractList[size];
		nbLists = 0;
	}
	
	public int findList(String name) {
		for ( int i = 0 ; i < nbLists ; i++) {
			if (Lists[i].getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean addList(AbstractList l) {
		if (nbLists < Lists.length && findList(l.getName()) == -1) {
			if (l instanceof UniqueList)
				Lists[nbLists++] = new UniqueList((UniqueList)l);
			else
				Lists[nbLists++] = new OrdinaryList((OrdinaryList)l);
			return true;
		}
		return false;
	}
	
	public boolean removeList(String name) {
		int index = findList(name);
		if (index != -1) {
			Lists[nbLists] = Lists[nbLists-1];
			nbLists--;
			return true;
		}
		return false;
	}
	
 	public boolean addToList(Element e, String name) {
 		int index = findList(name);
 		if (index != -1) {
 			Lists[index].add(e);
			return true;
 		}
		return false;
 	}
 	
 	public boolean removeFromList(int id, String name) {
 		int index = findList(name);
 		if (index != -1) {
 			int i = Lists[index].search(id);
 			Element e = Lists[index].getElement(i);
 			Lists[index].remove(e);
 			return true;
 		}
 		return false;
 	}
 	
 	public void printList(String name) {
 		int index = findList(name);
 		Lists[index].print();
 	}
 	
 	public int countAll(int id) {
 		int count = 0;
 		for (int i = 0 ; i < nbLists ; i++) {
 			if (Lists[i] instanceof OrdinaryList) {
 				count += ((OrdinaryList)Lists[i]).count(id);
 			}
 		}
 		return count;
 	}
 	
 	public void reverseAll() {
 		for (int i = 0 ; i < nbLists ; i++) {
 			if (Lists[i] instanceof UniqueList) {
 				((UniqueList)Lists[i]).reverse();
 			}
 		}
 	}
}
