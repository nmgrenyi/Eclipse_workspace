package leetcode26;

import java.util.Arrays;

public class Solution {
	
	    public int removeDuplicates(int[] nums) {
	        int p1, p2;
	        if (nums.length == 0){return 0;}
	        if (nums.length == 1){return 1;}
	        p1 = nums[0];
	        for(int i=1;i<nums.length;i++){
	            p2 = nums[i];
	            if (p1==p2 && i+1 < nums.length){
	                //nums[i] = nums[i+1];
	                for (int k=i;k+1<nums.length;k++){
	                    nums[k] = nums[k+1];
	                }
	                nums = Arrays.copyOfRange(nums,0,nums.length-1);
	                i--;
	            }
	            else if (p1 == p2 && i+1 >= nums.length){
	                //nums = nums[0:i-1];
	                nums = Arrays.copyOfRange(nums,0,i);
	            }
	            else if (p1 != p2){
	                p1 = p2;
	            }
	        }
	        for(int q : nums){
	        	System.out.print(q);
	        	System.out.print(',');
	        }
	        
	        return nums.length;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		int [] nums = {1,1,1,2};
		int length_nums = lc.removeDuplicates(nums);
		System.out.println(length_nums);
	}

}
