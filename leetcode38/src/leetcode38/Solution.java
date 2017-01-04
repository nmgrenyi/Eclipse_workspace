package leetcode38;

public class Solution {

	public String countAndSay(int n) {
        StringBuffer s = new StringBuffer("1");
        StringBuffer new_s = new StringBuffer();
        while(n>1){
            n--;
            int howMany = 1;
            char whatNumber = s.charAt(0);
            for(int i=0;i<s.length();i++){
                //if (whatNumber == ' '){
                //    whatNumber = s.charAt(i);
                //    howMany = 1;
                //}else   whatNumber != ' ' 
                if(s.charAt(i) == whatNumber){
                    howMany++;
                }else if (s.charAt(i) != whatNumber){
                    new_s.append(howMany).append(whatNumber);
                    howMany = 1;
                    whatNumber = s.charAt(i);
                }
            }
            s = new_s;
        }
        
        return s.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		
		System.out.println(lc.countAndSay(3));
	}

}
