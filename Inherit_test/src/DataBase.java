import java.util.ArrayList;

public class DataBase {
//	public ArrayList<CD> listCD = new ArrayList<CD>();
//	public ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd){
//		listCD.add(cd);
//	}
	
//	public void add(DVD dvd){
//		listDVD.add(dvd);
//	}
	
	public void add (Item item){
		listItem.add(item);
	}
	
//	public void list(){
//		for (CD cd : listCD){
//			cd.print();
//		}
//		for (DVD dvd : listDVD){
//			dvd.print();
//		}
//	}
	
	public void list(){
		for (Item item : listItem){
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item("a",0,true,"...");
		CD cd = new CD("a","a",0,0,"...");
		item = (Item)cd;
//		CD cc = (CD)item;
		
		DataBase db = new DataBase();
		db.add(new CD("abc", "abc", 4, 60, "..."));
		db.add(new CD("def", "def", 4, 60, "..."));
		db.add(new DVD("XXX", "aaa", 60, "..."));
		db.list();

	}

}
