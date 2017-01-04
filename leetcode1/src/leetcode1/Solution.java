package leetcode1;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] ret = new int[2];
        for(;i<nums.length;i++){
            for(;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    if (i != j){
                            ret[0] = i;
                            ret[1] = j;
                            return ret;
                        
                    }else{
                        continue;
                    }
                    
                    /*
                    if ( i != j & nums[j] == 0 & nums[i] == 0){
                        ret[0] = i;
                        ret[1] = j;
                        return ret;
                    }
                    else if (nums[i] != 0 & nums[i] == nums[j]){
                        break;
                    }else{
                        ret[0] = i;
                        ret[1] = j;
                        return ret;
                    }
                    */
                    
                }
            }
        }
        return ret;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		int[] input_nums = {3, 2, 4};
		
		System.out.println(lc.twoSum(input_nums, 6)[0]);
		System.out.println(lc.twoSum(input_nums, 6)[1]);

	}

}
