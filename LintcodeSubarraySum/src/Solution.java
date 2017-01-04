import java.util.ArrayList;

public class Solution {

	public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        int [] preSum = new int[nums.length];
        preSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
            if (i != 0 && preSum[i] == 0) {
                res.add(0);
                res.add(i);
                return res;
            }
        }
        
        for(int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (preSum[i] - preSum[j] == 0) {
                    res.add(i);
                    res.add(j + 1);
                }
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int[] nums = {1, -1};
		ArrayList<Integer> ans = solution.subarraySum(nums);
		for(int i : ans) {
			System.out.println(i);
		}
	}

}
