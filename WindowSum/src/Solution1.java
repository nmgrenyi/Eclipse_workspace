import java.util.*;

public class Solution1 {
	
	public List<Integer> GetSum (List<Integer> A, int k) {
		List<Integer> result = new ArrayList<Integer>();
		if (A == null || A.size() < k || k <= 0) {
			return result;
		}
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			count++;
			if (count >= k) {
				int sum = 0;
				for (int j = i; j >= i - k + 1; j--) {
					sum += A.get(j);
				}
				result.add(sum);
			}
		}
		return result;
	}
	
	public int[] SumOfWin (int[] array, int k) {
		if (array == null || array.length == 0 || k <= 0) {
			return null;
		}
		int[] res = new int[array.length - k + 1];
		for (int i = 0; i < k; i++) {
			res[0] += array[i];
		}
		for (int j = k; j - k + 1 < res.length; j++) {
			res[j - k + 1] = res[j - k] + array[j] - array[j - k];
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		A.add(8);
		A.add(9);
		A.add(10);
		Solution1 sls = new Solution1();
		for (int i : sls.GetSum(B, 2)) {
			//System.out.println(i);
		}
		
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}
		for (int i : sls.SumOfWin(array, 3)) {
			System.out.println(i);
		}
	}

}
