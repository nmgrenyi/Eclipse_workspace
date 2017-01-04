package leetocde343;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	
	 public boolean isSubsequence(String s, String t) {
	        List<Integer>[] idx = new List[256]; // Just for clarity
	        for (int i = 0; i < t.length(); i++) {
	            if (idx[t.charAt(i)] == null)
	                idx[t.charAt(i)] = new ArrayList<>();
	            idx[t.charAt(i)].add(i);
	        }
	        
	        int prev = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (idx[s.charAt(i)] == null) return false; // Note: char of S does NOT exist in T causing NPE
	            int j = Collections.binarySearch(idx[s.charAt(i)], prev);
	            System.out.println(j);
	            if (j < 0) j = -j - 1;
	            if (j == idx[s.charAt(i)].size()) return false;
	            prev = idx[s.charAt(i)].get(j) + 1;
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6};
		int res = Arrays.asList(array).indexOf(4);
		System.out.println(res);
	}

}
