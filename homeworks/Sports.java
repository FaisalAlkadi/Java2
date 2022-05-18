package fapplication;

public class Sports extends TV_Channel {
	private int nbMaches;

	public Sports(int v, boolean l, int nbm) {
		super(v, l);
		nbMaches=nbm;
		
	}
	public Sports(Sports S) {
		super(S);
		nbMaches=S.nbMaches;
	}

	public int getNbMaches() {
		return nbMaches;
	}
	public double calculateRating(){
		return super.getViews() / nbMaches*1.5;
	}
	public void display() {
		super.display();
		System.out.println("this is the Number of Maches"+nbMaches);
	}
	

	}


