public class DVD extends Item{
	private String director;

	public static void main(String[] args) {
		DVD dvd = new DVD("a","b",1,"........");
		dvd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DVD:");
		super.print();
		System.out.println(director);
	}

	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime, false,comment);
		setTitle("b");
		this.director = director;
	}

}
