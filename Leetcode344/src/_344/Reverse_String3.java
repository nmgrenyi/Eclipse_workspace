package _344;

public class Reverse_String3 {
	public static String reverseString(String s){
		String result = "";
		char[] ch = s.toCharArray();
		for (int i=ch.length-1;i>=0;i--){
			result +=ch[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
	}

}
