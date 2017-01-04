package leetcode8;

public class Solution3 {
	
	

	public int myAtoi(String str) {
        String strNoSpace = str.trim();
        if (strNoSpace.length() == 0){return 0;}
        int isPositive = 1;
        int total = 0;
        int digit = 0;
        int i=0;
        if(strNoSpace.charAt(0) == '-'){
            isPositive = -1;
            i = 1;
        }else if(strNoSpace.charAt(0) == '+'){
            i = 1;
        }
        for(;i<strNoSpace.length();i++){
            if (strNoSpace.charAt(i) == '-' | strNoSpace.charAt(i) == '+'){
                return 0;
            }
            if (strNoSpace.charAt(i) == ' '){
                return total * isPositive / 10;
            }
            digit = strNoSpace.charAt(i) - '0';
            if (digit > 10){
                return isPositive * total/10;
            }
            if (total * isPositive >= 2147483640 & digit >= 7){
                return 2147483647;
            }
            if (total * isPositive <= -2147483640 & digit >= 8){
                return -2147483648;
            }
            total += digit;
            
            if(total * isPositive <= 2147483646 & i == strNoSpace.length()-1){
                return total * isPositive;
            }
            /*
            if (total * isPositive == -2147483647){
                return -2147483647;
            }
            if (total * isPositive == -2147483648){
                return -2147483648;
            }
            */
            if (total * isPositive >= -2147483647 & i == strNoSpace.length()-1){
                return total * isPositive;
            }
            
            
            total *= 10;
            
        }
        total /= 10;
        total *= isPositive;
        return total;
        
    }
	
	
	
	public int myAtoi2(String str) {
        String strNoSpace = str.trim();
        if (strNoSpace.length() == 0){return 0;}
        int isPositive = 1;
        int total = 0;
        int digit = 0;
        int i=0;
        if(strNoSpace.charAt(0) == '-'){
            isPositive = -1;
            i = 1;
        }else if(strNoSpace.charAt(0) == '+'){
            i = 1;
        }
        for(;i<strNoSpace.length();i++){
            if (strNoSpace.charAt(i) == '-' | strNoSpace.charAt(i) == '+'){
                return 0;
            }
            if (strNoSpace.charAt(i) == ' '){
                return total * isPositive;
            }
            digit = strNoSpace.charAt(i) - '0';
            if (digit > 10){
                return isPositive * total;
            }
            if (total * isPositive >= 214748364 & digit >= 7){
                return 2147483647;
            }
            if (total * isPositive <= -214748364 & digit >= 8){
                return -2147483648;
            }
            total *= 10;
            total += digit;
            
            if (i == strNoSpace.length() -1){
                return total * isPositive;
            }
            
            
            
            if(total * isPositive >= 2147483646 & i == strNoSpace.length()-1){
                return total * isPositive;
            }
            /*
            if (total * isPositive == -2147483647){
                return -2147483647;
            }
            if (total * isPositive == -2147483648){
                return -2147483648;
            }
            */
            if (total * isPositive >= -2147483647 & i == strNoSpace.length()-1){
                return total * isPositive;
            }
            
            
            //total *= 10;
            
        }
        //total /= 10;
        total *= isPositive;
        return total;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 lc = new  Solution3();
		String str = "    -11919730356x";
		System.out.println(lc.myAtoi2(str));
	}

}
