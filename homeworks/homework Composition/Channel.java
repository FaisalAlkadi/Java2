package fapplication;

import java.util.Arrays;

public class Channel {
	private String name;
	private Playlist[] playlists;
	private int nbp;
	
	
	public Channel(String name, int size) {
		this.name = name;
		playlists = new Playlist[size];
		nbp = 0;
	}
	public int findPlaylist(Playlist p) {
		for(int i=0;i<nbp;i++)
			if(playlists[i].equals(p))
				return i;
		
		return -1;
	}
	public boolean addPlaylist(Playlist p) {
		if (nbp < playlists.length && findPlaylist(p)==-1) {
			playlists[nbp++] = p;
			return true;
		}
			return false;
		
	}
	public boolean deletePlaylist(Playlist p) {
		int loc= findPlaylist(p);
		for(int i=loc;i<nbp-1&&loc!=-1;i++) {
			playlists[i]=playlists[i+1];
			nbp--;
		return true;
		}
		return false;
	}
	public boolean flipSharedStatusOf(Playlist p) {
		int index = findPlaylist(p);
		if (index == -1)
			return false;
		playlists[index].setShared(!playlists[index].isShared());
		return true;
	}
	public Playlist getPlaylist(category Category) {
		int max = 0;
		for (int i = 0; i < nbp; i++) {
			int count = playlists[i].countVideosOf(Category);
			if (count > max) {
				max = count;
				return playlists[i];
			}
		}
		return null;
	}
	public void sortPlaylists() {
		for (int i = 0; i < nbp; i++)
			playlists[i].sortOnDuration();
	}
	void display() {
		 System.out.println("Channel [name=" + name + ", playlists=" + Arrays.toString(playlists) + ", nbp=" + nbp + "]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
