package leetcode260;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	public int[] singleNumber(int[] nums) {
        //int[] res = new int[2];
        List<Integer> res = new LinkedList<Integer>();
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int n : nums) {
            map.put(n, !map.getOrDefault(n, true));
        }
        for (int k : map.keySet()) {
            if (map.get(k) == false) {
                res.add(k);
            }
        }
        int[] tmp = new int[2];
        //tmp[0] = res.get(0);
        //tmp[1] = res.get(1);
        int[] a = new int[2];
        int[] tmp2 = res.toArray(a);
        return tmp2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
