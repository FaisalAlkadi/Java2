package fapplication;

public abstract class TV_Channel implements Viewable {
	private int views;
	private boolean live;
	protected TV_Program[]arProg;
	protected int nbProg;
	public TV_Channel(int v ,boolean l){
		views=v;
		live=l;
		arProg=new TV_Program[20];
		nbProg=0;
		
	}
	public TV_Channel(TV_Channel T){
		views=T.views;
		live=T.live;
		nbProg=T.nbProg;
		arProg=new TV_Program[T.arProg.length];
		for(int i=0;i<T.nbProg;i++)
			arProg[i]=T.arProg[i];
	}
	
	public int getViews() {
		return views;
	}
	public boolean isLive() {
		return live;
	}
	public abstract double calculateRating();
	public void display() {
		System.out.println("this is the views"+views);
		if(isLive())
		System.out.println("and the live of channel"+live);
		else 
			System.out.println("and the live of channel"+live);
		
		for(int i=0;i<nbProg;i++) {
		System.out.println("this is the arProg["+i+"]="+arProg[i]);
		}
	}
	

}
