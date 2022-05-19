public class TV_Channel { 
	
	private String name;
	private boolean live;
	private int frequancy;
	private TV_Program[] arProg;
	private int nbp; 	
	public TV_Channel(String name, boolean live, int frequancy) 
	{
		this.name = name;
		this.live = live;
		this.frequancy = frequancy;
		arProg = new TV_Program[25]; 
		nbp = 0; 
	}

        public TV_Channel(TV_Channel p)  
	{
		name = p.name;
		live = p.live;
		frequancy = p.frequancy;
		arProg=new TV_Program[p.arProg.length]; 
		nbp = 0; 
		for(int i=0; i<p.nbp; i++) 
			addProgram(p.arProg[i]); 
	}
	
	public boolean addProgram(TV_Program p) 
	{
		if(nbp >= arProg.length) 

			return false; 
		
		arProg[nbp] = p; //aggregation
		nbp++; 
		return true; 

	}
	
	public boolean contains(String pname) 
	{
		for(int i=0; i<nbp; i++)
			if(arProg[i].getName().equals(pname)) 
				return true; 
		return false; 
	}
	
	public double avgAudienceRate(String d) 
	{
		double sum=0; 
		int count =0; 
		for(int i=0; i<nbp; i++) 
			if(arProg[i].getDay().equals(d))
			{
				sum+=arProg[i].getAudienceRate(); 
				count++;
			}
		
		if(count == 0) return 0; 
		return sum/count; 
	}

	public boolean isLive() {
		return live;
	}
}


	public TV_Channel bestTV_Channel(String d) 
	{
		TV_Channel best = arTV[0]; 
		
		for(int i=1; i<nbc; i++) 
			if(best.avgAudienceRate(d) < arTV[i].avgAudienceRate(d)) 
				best = arTV[i]; 
		
		return best; 
	}

}

