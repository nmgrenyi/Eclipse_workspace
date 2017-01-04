package leetcode290;

import java.util.HashMap;

public class Solution {

	public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> pL_strW = new HashMap<Character, String>();
        String[] str_list = str.split("\\s+");
        for(String s : str_list){
        	System.out.println(s);
        	
        }
        //System.out.println(str_list.length);
        //System.out.println(pattern.length());
        /*
        if (pattern.length() != str_list.length){
            return false;
        }
        */
        boolean samePattern = true;
        for(int i=0;i<pattern.length() && i<str_list.length;i++){
            if (pL_strW.containsKey(pattern.charAt(i))){
                if (!pL_strW.get(pattern.charAt(i)).equals(str_list[i])){
                	System.out.print( pL_strW.get(pattern.charAt(i)) );
                	System.out.println(str_list[i]);
                    samePattern = false;
                }
            }else{
                pL_strW.put(pattern.charAt(i), str_list[i]);
            }
        }
        return samePattern;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		String pattern1 = "abba";
		String str1 = "dog cat cat dog";
		System.out.println(lc.wordPattern(pattern1, str1));
	}

}
