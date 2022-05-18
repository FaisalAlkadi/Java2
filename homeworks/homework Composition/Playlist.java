package fapplication;

import java.util.Arrays;

public class Playlist {
	private String name;
	private boolean shared;
	private Video videos[];
	private int nb;
	
	public Playlist() {
		
	}
	
	public Playlist(String name, boolean shared, int size) {
		this.name=name;
		this.shared=shared;
		videos=new Video[size];
		nb=0;
	}
	public Playlist(Playlist p) {
		this.name=p.name;
		this.shared=p.shared;
		Video []videos= new Video[p.videos.length];
	}
	public boolean addVideo(Video v) {
		if(nb<videos.length) {
			videos[nb++]=v;
			return true;
		} else {
			return false;
		}
		
	}
	public int findVideo(Video v) {
		for(int i=0;i<nb;i++)
			if(videos[i].equals(v))
				return i;
		
		return -1;
	}
	
	public boolean removeVideo(Video v) {
		int loc= findVideo(v);
		for(int i=loc;i<nb-1&&loc!=-1;i++) {
			videos[i]=videos[i+1];
			nb--;
		return true;
		}
		
		return false;
	}
	
	public int countVideosOf(category Category) {
		int cont=0;
		for(int i=0;i<nb;i++) 
			if(videos[i].getCategory()==Category)
				cont++;
			
		return cont;
			
			
	}
	void sortOnDuration() {
		Video v;
		for(int i=0;i<nb;i++)
			for(int j=0;i<nb-1;j++) {
				if(videos[j].getDuration() > videos[j+1].getDuration()) {
					v=videos[j];
					videos[j]=videos[j+1];
					videos[j+1]=v;
				}
			}
			
	}

	public String getName() {
		return name;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}

	
	void display() {
		System.out.println("Playlist [name=" + name + ", shared=" + shared + ", videos=" + Arrays.toString(videos) + ", nb=" + nb
				+ "]");
	}

	
	
	

}
