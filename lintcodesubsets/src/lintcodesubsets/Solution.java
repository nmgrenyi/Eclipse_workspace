package lintcodesubsets;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int pos = 0;
        Arrays.sort(nums);
        SubsetHelper(res, list, nums, pos);
        return res;
    }
    
    public void SubsetHelper(ArrayList<ArrayList<Integer>> res, 
                            ArrayList<Integer> list, 
                            int[] nums,
                            int pos) {
        res.add(new ArrayList<Integer>(list));
        //res.add(list);
        for (int i = pos; i < nums.length; i++) {
            list.add(nums[i]);
            SubsetHelper(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3};
		Solution lint = new Solution();
		System.out.println(lint.subsets(nums));
	}

}
