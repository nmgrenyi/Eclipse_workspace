package _344;

public class Reverse_String {
	
	public static String reverseString(String s) {
        StringBuffer s_n = new StringBuffer();
        for (int i=(s.length()-1),j=0;i>=0 & j<s.length();i--,j++){
            s_n.replace(j,j, String.valueOf(s.charAt(i)));
        }        
        System.out.println(s_n.toString());
        return s_n.toString();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_String.reverseString("hello");
		String s_new = new String("12345");
//		System.out.println(s_new.);

	}

}
