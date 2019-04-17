import java.util.HashMap;

public class RestaurantNameIndexAddMin {

	public String MinIndexAddName(String[] list1, String[] list2) {
		if (list1 == null || list1.length == 0 || list2 == null || list2.length == 0) {
			return "";
		}
		
		HashMap<String, Integer> nameIndexList1Map = new HashMap<>();
		for(int i = 0; i < list1.length; i++) {
			nameIndexList1Map.put(list1[i], i);
		}
		int sumOfAddIndex = Integer.MAX_VALUE;
		String res = "null";
		for (int j = 0; j < list2.length; j++) {
			if (nameIndexList1Map.containsKey(list2[j]) && j + nameIndexList1Map.get(list2[j]) < sumOfAddIndex) {
				res = list2[j];
				sumOfAddIndex = j + nameIndexList1Map.get(list2[j]);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantNameIndexAddMin rnanim = new RestaurantNameIndexAddMin();
		String[] list1 = {"A", "B", "C", "D", "E"};
		String[] list2 = {"X", "Z", "W", "A", "D"};
		String res = rnanim.MinIndexAddName(list1, list2);
		System.out.println(res);
	}

}
