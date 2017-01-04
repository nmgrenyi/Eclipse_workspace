package lintcodeEditDistance;

public class Solution {
	
	public int minDistance(String word1, String word2) {
        // write your code here
        int [][] res = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            res[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            res[0][j] = j;
        }
        for (int i = 1; i < word1.length() + 1; i++) {
            for(int j = 1; j < word2.length() + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    res[i][j] = res[i - 1][j - 1];
                }
                else{
                    res[i][j] = Math.min(res[i][j - 1], Math.min(res[i - 1][j], res[i - 1][j - 1])) + 1;
                }
            }
        }
        
        for(int i = 0; i < word1.length() + 1; i++){
        	for(int j = 0; j < word2.length() + 1; j++){
        		System.out.print(res[i][j]);
        	}
        	System.out.println();
        }
        return res[word1.length()][word2.length()];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String word1 = new String("mart");
		String word2 = new String("karma");
		solution.minDistance(word1, word2);
	}

}
