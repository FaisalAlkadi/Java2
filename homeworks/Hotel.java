package fapplication;

public class Hotel {
	private String hotelName;
	private Guest arrGuest[];
	private int nb;
	
	public Hotel (int size,String hotelName) {
		this.hotelName = hotelName;
		arrGuest = new Guest[size];
		nb = 0;
	}
	
	public boolean addGuest (Guest g) {
		if (nb < arrGuest.length ) {
			arrGuest[nb++] = g;
			return true;
		} else {
			return false;
		}
	}
	
	public int countGuests (String n) {
		int num = 0;
		for (int i = 0 ; i < nb; i++ )
			if (arrGuest[i].getNationality().equalsIgnoreCase(n)) 
				num++;
		return num;
	}
	
	public Guest getOldestGuest() {
		int oldest = 0;
		for (int i = 0 ; i < nb ; i++ )
			if (arrGuest[i].getAge() > arrGuest[oldest].getAge())
				oldest = i;
		return arrGuest[oldest];
	}
	
	public Guest[] getGuests (String n) {
		Guest gu[] = new Guest[nb];
		int nbg = 0;
		for (int i = 0 ; i < nb ; i++ )
			if (arrGuest[i].getNationality().equalsIgnoreCase(n))
				gu[nbg++] = arrGuest[i];
		return gu;
	}
	
	public int splitGuests(Guest[] saudi , Guest[] expat) {
		int sa = 0 ;
		int ex = 0;
		for (int i = 0 ; i < nb ; i++ )
			if (arrGuest[i].getNationality().equalsIgnoreCase("Saudi")) 
				saudi[sa++] = arrGuest[i];
			else 
				expat[ex++] = arrGuest[i];

		return ex;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest f= new Guest(1, "Faisal","Saudi",21);
		Guest f1= new Guest(2, "Ali","Kuwaiti",27);
		Guest f2= new Guest(3, "Ahmed","Bahraini",18);
		Guest f3= new Guest(4, "Bader","Yemeni",21);
		Guest f4= new Guest(5, "khalid","Bahraini",23);
		Hotel h =new Hotel(5, "Marriott");
		h.addGuest(f);
		h.addGuest(f1);
		h.addGuest(f2);
		h.addGuest(f3);
		h.addGuest(f4);
		int gnum=h.countGuests("Saudi");
		System.out.println("the number of saudi guests: "+ gnum);
		Guest f5=h.getOldestGuest();
		System.out.print("the oldest Guest: ");
		f5.displayGuestInfo();
		Guest[]arr=h.getGuests("Saudi");
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=null)
				arr[i].displayGuestInfo();
		Guest[] saudi= new Guest[10];
		Guest[] expat= new Guest[10];
		h.splitGuests(saudi, expat);
		for(int i=0;i<saudi.length;i++)
			if(saudi[i]!=null)
				saudi[i].displayGuestInfo();
		for(int i=0;i<expat.length;i++)
			if(expat[i]!=null)
				expat[i].displayGuestInfo();
	

		

	}

}
