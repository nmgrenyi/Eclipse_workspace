package leetcode8;

public class Solution {
	public int myAtoi(String str) {
        char[] charDigits = str.toCharArray();
        int digitTmp = 0;
        int wrong = -1;
        int total = 0;
        int noOfDigit = 1;
        if (str.length() == 0){return 0;}
        for(int i=str.length()-1;i>0;i--){
            digitTmp = charDigits[i] - '0';
            if (digitTmp == -16){
                continue;
            }
            if (digitTmp > 10 | digitTmp < 0){
                return 0;
            }
            total += noOfDigit * digitTmp;
            noOfDigit *= 10;
        }
        if (charDigits[0] == '-'){
            total = -1 * total;
        }else if (charDigits[0] == '+'){
            return total;
        }else{
            digitTmp = charDigits[0] - '0';
            if (digitTmp == -16){
                return total;
            }
            if (digitTmp > 10 | digitTmp < 0){
                return 0;
            }
            total += noOfDigit * digitTmp;
        }
        return total;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 lc = new Solution3();
		String str = "   010";
		System.out.println(lc.myAtoi(str));

	}

}
