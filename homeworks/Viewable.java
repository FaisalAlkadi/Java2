package fapplication;

public interface Viewable {
	public void display();
	public static void main(String[] args) {
		TV_Program pr=new TV_Program(3.8);
		pr.display();
		TV_Channel ch=new Sports(30,true,30);
		ch.calculateRating();
		ch.display();
		TV_Channel ch1=new News(5000,true,6,8);
		ch1.calculateRating();
		ch1.display();
		TV_Group tg=new TV_Group("pro");
		tg.add(ch);
		tg.add(ch1);
		tg.countLiveSport();
		tg.displaySport(3);
		tg.getNews(2);
		TV_Channel[] t=new TV_Channel[25];
		News[] n=new News[25];
		tg.splitChannels(t,n);
	}
		
	

}
