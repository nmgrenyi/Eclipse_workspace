package Leetcode345;

public class leetcode345 {
	public static String reverseVowels(String s) {
        char [] ca = s.toCharArray();
        int n = (s.length()-1);
        for (int i=0;i<s.length()/2;i++){
            if (ca[i] =='a' || ca[i] =='e' || ca[i]=='i' || ca[i]=='o' || ca[i] =='u' || ca[i] == 'A' || ca[i] == 'E' || ca[i] == 'I' || ca[i] == 'O' || ca[i] == 'U'){
                
                for (int j=n;j>=s.length()/2;j--){
                    if(ca[j] == 'a' || ca[j] == 'e' || ca[j] == 'i'|| ca[j] == 'o' || ca[j] == 'u'|| ca[j] == 'A' || ca[j] == 'E' || ca[j] == 'I'|| ca[j] == 'O' || ca[j] == 'U'){
                        char tmp = ca[i];
                        ca[i] = ca[j];
                        ca[j] = tmp;
                        n = j-1;
                        break;
                    }
                }
            }
        }
        return new String(ca);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("Marge,let's \"went.\" I await news telegram."));

	}

}
