import java.util.HashSet;
import java.util.Set;

public class Solution {

	public String reverseVowels(String s) {
        char [] c_list = s.toCharArray();
        int s_length = s.length();
        Set<Character> vowols_list = new HashSet<Character>();
        vowols_list.add('a');
        vowols_list.add('e');
        vowols_list.add('i');
        vowols_list.add('o');
        vowols_list.add('u');
        vowols_list.add('A');
        vowols_list.add('E');
        vowols_list.add('O');
        vowols_list.add('I');
        vowols_list.add('U');
        int l_of_s_vowols = 0;
        for(char c : c_list){
            if(vowols_list.contains(c)){
                l_of_s_vowols++;
            }
        }
        System.out.println(l_of_s_vowols);
        for(int i=0,j=s_length-1,k=0;k<l_of_s_vowols/2 && i<j && i<s_length-1 && j>0;){
            if(vowols_list.contains(c_list[i]) && vowols_list.contains(c_list[j])){
                char tmp = c_list[i];
                c_list[i] = c_list[j];
                c_list[j] = tmp;
                i++;
                j--;
                k++;
            }
            else if(vowols_list.contains(c_list[i]) && !vowols_list.contains(c_list[j])){
                j--;
            }
            else if(!vowols_list.contains(c_list[i]) && vowols_list.contains(c_list[j])){
                i++;
            }else{
                j--;
                i++;
            }
        }
        
        return String.valueOf(c_list);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc345 = new Solution();
		String s = "hello";
//		String s1 = String.valueOf(lc345.reverseVowels(s));
		System.out.println(lc345.reverseVowels(s));
	}

}
