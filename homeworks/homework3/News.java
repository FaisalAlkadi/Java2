package fapplication;

public class News extends TV_Channel {
	private int newsSegments;
	private int breakingNews;

	public News(int v, boolean l,int ne,int br ) {
		super(v, l);
		newsSegments=ne;
		breakingNews=br;
	}
	public News(News N){
		super(N);
		newsSegments=N.newsSegments;
		breakingNews=N.breakingNews;
	}

	public int getBreakingNews() {
		return breakingNews;
	}

	public int getNewsSegments() {
		return newsSegments;
	}
	public double calculateRating(){
		double sum=0;
		for(int i=0;i<nbProg;i++)
			sum+=arProg[i].getAudienceRate();
			
		return (super.getViews() / breakingNews)+(sum/super.nbProg);
	}
	public void display() {
		super.display();
		System.out.println("this is the Number of news Segments"+newsSegments);
		System.out.println("this is the Number of breaking News"+breakingNews);
	}
	

}
