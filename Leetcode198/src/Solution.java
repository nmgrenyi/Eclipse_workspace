
public class Solution {
	
	public int rob(int[] nums) {
        if (nums.length == 0){return 0;}
        if (nums.length == 1){return nums[0];}
        if (nums.length == 2){return Math.max(nums[0],nums[1]);}
        int [] d = new int[nums.length];
        d.
        d[0] = nums[0];
        d[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int max_d = 0;
            for(int j=0;j<i-1;j++){
                if (nums[j]>max_d){
                    max_d = nums[j];
                }
            }
            d[i] = Math.max(d[i-1],nums[i]+max_d);
        }
        return d[nums.length-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc198 = new Solution();
		int [] nums = {2,7,9,3,1};
		System.out.println(lc198.rob(nums));
	}

}
