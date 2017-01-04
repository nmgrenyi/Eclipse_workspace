package backpack;

public class Solution {

	public int backPack(int m, int[] A) {
        boolean f[][] = new boolean[A.length + 1][m + 1];
        for (int i = 0; i <= A.length; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = false;
            }
        }
        f[0][0] = true;
        for (int i = 1; i <= A.length; i++) {
            for (int j = 0; j <= m; j++) {
                f[i][j] = f[i - 1][j];
                if (j >= A[i-1] && f[i-1][j - A[i-1]]) {
                    f[i][j] = true;
                }
            } // for j
        } // for i
        for (int i = 0; i <= A.length; i++) {
            for (int j = 0; j <= m; j++) {
                    if(f[i][j])
                        System.out.print(1);
                    else
                        System.out.print(0);
            } // for j
            System.out.println();
        }
        
        for (int i = m; i >= 0; i--) {
            if (f[A.length][i]) {
                return i;
            }
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int[] A = {3, 4, 8, 5};
		int m = 10;
		int res = solution.backPack(m, A);
		System.out.println(res);
	}

}
