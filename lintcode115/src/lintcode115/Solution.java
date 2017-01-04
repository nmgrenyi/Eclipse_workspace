package lintcode115;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
	      public int val;
	      public TreeNode left, right;
	      public TreeNode(int val) {
	          this.val = val;
	          this.left = this.right = null;
	      }
	  }

public class Solution {

	
	 public int minimumTotal(int[][] triangle) {
	        // write your code here
	        if (triangle == null || triangle.length == 0 || triangle[0].length == 0) {
	            return 0;
	        }
	        
	        int[][] curVal = new int [triangle.length][triangle.length];
	        
	        //initial
	        curVal[0][0] = triangle[0][0];
	        for (int i = 1; i < triangle.length; i++) {
	            curVal[i][0] = curVal[i - 1][0] + triangle[i][0];
	            curVal[i][i] = curVal[i - 1][i - 1] + triangle[i][i];
	        }
	        
	        //cal
	        for(int p = 2; p < triangle.length; p++) {
	            for (int q = 1; q < p; q++) {
	                curVal[p][q] = Math.min(curVal[p - 1][q - 1], curVal[p - 1][q]) + triangle[p][q];
	            }
	        }
	        
	        int max = Integer.MAX_VALUE;
	        for (int m = 0; m < curVal.length; m++){
	            if (curVal[curVal.length - 1][m] < max) {
	                max = curVal[curVal.length - 1][m];
	            }
	        }
	        return max;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sls = new Solution();
		int[][] triangle = {{1},{2,3}};
		System.out.println(sls.minimumTotal(triangle));
	}

}
