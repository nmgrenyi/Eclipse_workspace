package leetcode409;

import java.util.HashMap;

public class Solution {

	public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        int maxOdd = 0;
        int sumEvenBit = 0;
        for(char c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                maxOdd = Math.max(map.get(c), maxOdd);
            }else{
                sumEvenBit += map.get(c);
            }
        }
        for(char c : map.keySet()) {
            System.out.print(c);
            System.out.print(" ");
            System.out.println(map.get(c));
        }

        return sumEvenBit + maxOdd;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		Solution solution = new Solution();
		int res = solution.longestPalindrome(s);
		System.out.println(res);
	}

}
