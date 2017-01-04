
public class Solution2 {
	public int myAtoi(String str) {
        char[] charDigits = str.toCharArray();
        int digitTmp = 0;
        int total = 0;
        int noOfDigit = 1;
        boolean endNum = false;
        if (str.length() == 0){return 0;}
        for(int i=str.length()-1;i>0;i--){
            if (charDigits[i] == '+'){
                endNum = true;
                continue;
            }
            if (charDigits[i] == '-' && endNum == true){
                return 0;
            }
            digitTmp = charDigits[i] - '0';
            if (digitTmp == -16){
                continue;
            }
            if (charDigits[i] == '-' && endNum == false){
                total = -1 * total; 
                endNum = true;
            }
            if (digitTmp > 10 | (digitTmp < 0 && digitTmp > -3) | digitTmp <-3){
                return 0;
            }
            total += noOfDigit * digitTmp;
            noOfDigit *= 10;
        }
        if (charDigits[0] == '-' && endNum == true){
                return 0;
            }
        if (charDigits[0] == '-' && endNum == false){
            total = -1 * total;
        }else if (charDigits[0] == '+' && endNum == false){
            return total;
        }else if (charDigits[0] == '+' && endNum == true){
            return 0;
        }
        else{
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
		Solution2 lc = new Solution2();
		String str = "   -00134";
		System.out.println(lc.myAtoi(str));
	}

}
