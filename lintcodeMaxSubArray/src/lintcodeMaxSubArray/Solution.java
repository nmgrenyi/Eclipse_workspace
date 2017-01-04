package lintcodeMaxSubArray;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class Solution {
	
	public int maxSubArray(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }
        
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {-2,1,-3,4,-1,2,1,-5,4};
		Solution solution = new Solution();
		System.out.println(solution.maxSubArray(A));
	}

}
