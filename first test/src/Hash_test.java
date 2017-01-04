import java.util.HashMap;
import java.util.Iterator;

public class Hash_test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		Iterator<String> it = map.keySet().iterator();
		map.put("name", "A");
		map.put("name", "B");
		map.put("name", "C");
		map.put("name", "D");
		while (it.hasNext()){
			String key = it.next();
			System.out.println("key: "+key);
			System.out.println("value: "+map.get(key));
		}
		System.out.println(map.get("name"));
	}

}
