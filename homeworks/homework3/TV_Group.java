package fapplication;



public class TV_Group {
	private String name;
	private TV_Channel[] arTV;
	private int nb;
	public TV_Group(String n){
		name =n;
		arTV=new TV_Channel[25];
		nb=0;
	}
	void add(TV_Channel tvc){
		if(nb<arTV.length) {
			if(tvc instanceof Sports)
				arTV[nb++]=new Sports((Sports)tvc);
			if(tvc instanceof News)
				arTV[nb++]=new News((News)tvc);
			else 
				arTV[nb++]=tvc;
			
	}
	}
	public int countLiveSport(){
		int cont=0;
		for(int i=0;i<nb;i++){
			if(arTV[i] instanceof Sports)
				if(arTV[i].isLive())
					cont++;
		}
		return cont;
	}
	void displaySport(int n) {
		for(int i=0;i<nb;i++){
			if(arTV[i] instanceof Sports)
			if(((Sports)arTV[i]).getNbMaches()>n)
				((Sports)arTV[i]).display();
		}
	}
	public News[] getNews(int b) {
		News[]arn= new News[nb];
		int nbs=0;
		for(int i=0;i<nb;i++){
			if(arTV[i] instanceof News)
				if(((News)arTV[i]).getBreakingNews()>b)
					arn[nbs++]=(News)arTV[i];
			
		}return arn;
	}	
	void splitChannels(TV_Channel[]t,News[]n) {
		int nt=0 ,nn=0;
		for(int i=0;i<nb;i++){
			if(arTV[i] instanceof Sports)
			if(((Sports)arTV[i]).getNbMaches()>20)
				t[nt++]=arTV[i];
			if(arTV[i] instanceof News)
				if(arTV[i].getViews()>3000)
					n[nn++]=(News)arTV[i];
	}
	}
	
}
