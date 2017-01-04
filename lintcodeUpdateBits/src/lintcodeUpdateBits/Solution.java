package lintcodeUpdateBits;

public class Solution {

    public int updateBits(int n, int m, int i, int j) {
        // write your code here
        int mask = 0;
        for(int k = 0; k < i; k++) {
            mask = mask + (n & 1);
            mask = mask <<1;
            n = n >> 1;
        }
        mask = (mask >> 1);
        n = (n >> (j - i + 1));
        //System.out.println(n);
        n = (n << (j - i + 1));
        n = (n | m);
        for(int k = 0; k < i; k++) {
            n = (n << 1);
            n = (n + (mask & 1));
            mask = (mask >> 1);
        }
        //n = (n << i);
        //n = (n | mask);
        return n;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int ans = solution.updateBits(-11, -789, 0, 31);
		System.out.println(ans);
	}

}
