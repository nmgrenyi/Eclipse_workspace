public class CD extends Item{
	private int numofTracks;
	private String artist;

	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
//		this.title = title;
//		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("CD");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD ("a","b",2,2,".......");
		cd.print();

	}

}
