package _344;

public class Reverse_String4 {
	public static String reverseString (String s){
		return new StringBuffer(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
	}

}
