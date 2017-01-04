package _344;

public class Reverse_String2 {
	public static String reverseString(String s){
		char[] StrChar = s.toCharArray();
		int left = 0;
		int right = s.length()-1;
		for (int i=0;i<s.length()/2;i++){
			char tmp = StrChar[left];
			StrChar [left] = StrChar [right];
			StrChar [right] = tmp;
			left++;
			right--;
		}
		return new String(StrChar);
	}
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}

	char c ='c';
	
}
