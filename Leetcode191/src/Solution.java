
public class Solution {
	public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char [] cl = s.toCharArray();
        int total = 0;
        for (char c : cl){
            total += Integer.parseInt(String.valueOf(c));
        }
        return total;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(0));
	}

}
