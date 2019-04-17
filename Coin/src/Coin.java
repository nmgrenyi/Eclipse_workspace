import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer,String>();
	
	public Coin(){
		coinnames.put(1, "penny");
		coinnames.put(10, "nickel");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dollar");
		coinnames.put(50, "wumao");
		System.err.println(coinnames);
		for (Integer k :coinnames.keySet()){
			String s = coinnames.get(k);
			System.out.println(s);
		}
	}
	public String getName(int amount){
		
//		switch(amount){
//		case 10: return "dime";
//		default: return "No";
//		}
		if (coinnames.containsKey(amount)){
			return coinnames.get(amount);
		}
		else
			return "NOT FIND";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
