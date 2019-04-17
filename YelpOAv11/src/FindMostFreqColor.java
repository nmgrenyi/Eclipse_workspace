import java.util.List;
import java.util.*;

public class FindMostFreqColor {

	public List<String> MostFreqColor(String[] stringArray) {
		if (stringArray == null || stringArray.length == 0) {
			return null;
		}
		
		List<String> res = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		int maxFreq = 0;
		
		//build hashmap<color, freq>, and find the most freq color
		for (String s : stringArray) {
			map.put(s, map.getOrDefault(s, 0) + 1);
			maxFreq = Math.max(maxFreq, map.get(s));
		}

		//output the most freq collor to result arraylist
		for (String s : map.keySet()) {
			if (map.get(s) == maxFreq) {
				res.add(s);
			}
		}
		
		//sort the color
		Collections.sort(res);
		Collections.reverse(res);
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input1 = {"red", "red", "orange", "yellow", "green", "green", "white", "pink", "blue"};
		FindMostFreqColor findmostfreqcolor = new FindMostFreqColor();
		for (String s : findmostfreqcolor.MostFreqColor(input1)) {
			System.out.println(s);
		}
	}

}
