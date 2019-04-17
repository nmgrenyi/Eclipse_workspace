import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

	class NewCompare implements Comparator<Integer> {
		public int compare(Integer i1, Integer i2) {
			return i1 - i2;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] list = {1, 2, 3, 4, 5, 6};
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			list.add(i);
		}
		//NewCompare c = new NewCompare();
		//Arrays.sort(list, new NewCompare());
		Collections.sort(list, new Comparator<Integer>() {
				public int compare(Integer i1, Integer i2) {
					return i1 - i2;
				}});
		
		for (int i : list) {
			System.out.println(i);
		}
		
	}

}
