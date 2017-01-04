import java.util.ArrayList;

public class ArrayList_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		for (int i=0;i<al.size();i++){
			String alEach = (String)al.get(i);
			System.out.println(alEach);
		}
		
		al.remove(1);
		al.add(1, "e");
		for (int i=0;i<al.size();i++){
			String alEach = (String)al.get(i);
			System.out.println(alEach);
		}
		al.iterator();
	}

}
