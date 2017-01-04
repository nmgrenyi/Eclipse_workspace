package lintcodesubsets;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();  
        int max = 1 << nums.length; //how many sub sets  
        Arrays.sort(nums);
        for(int i=0; i<max; i++){  
            int index = 0;  
            int k = i;  
            ArrayList<Integer> s = new ArrayList<Integer>();  
            while(k > 0){  
                if((k&1) > 0){  
                    s.add(nums[index]);  
                }  
                k>>=1;  
                index++;  
            }  
            allsubsets.add(s);  
        }  
        return allsubsets; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 lint = new Solution2();
		int[] nums = {1, 2, 3};
		System.out.println(lint.subsets(nums));

	}

}
