public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV_Program prog1 = new TV_Program("Islamic voice",80,"Saturday",21);  
		TV_Program prog2 = new TV_Program("Quran and Sunnah",70,"Sunday",23); 
		
		TV_Channel tvc = new TV_Channel("Peace TV", false,13547); 
		
		System.out.println(tvc.addProgram(prog1)); 
		System.out.println( tvc.addProgram(prog2)); 
		
		TV_Group tvg = new TV_Group("Islam Every Where",10); 
		
		System.out.println(tvg.add(tvc)); 
		
		System.out.println(tvg.countLiveTV("Sunday", 50)); 


	}

}
