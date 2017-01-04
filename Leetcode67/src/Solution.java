import java.util.Arrays;

public class Solution {

	
	public String addBinary1(String a, String b) {
        int maxLength = Math.max(a.length(),b.length());
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        for(int i=0;i<maxLength;i++){
            int tempA = a.length() - i -1 >= 0 ? a.charAt(a.length()-i-1) - 0 : 0;
            int tempB = b.length() - i -1 >= 0 ? b.charAt(b.length()-i-1) - 0 : 0;
            sb.insert(0, (tempA + tempB + carry)%2 );
            if (tempA + tempB + carry >= 2){
                carry = 1;
            }else{
                carry = 0;
            }
        }
        if (carry == 1){
            sb.insert(0,1);
        }
        return sb.toString();
    }
	
	public String addBinary(String a, String b) {
        char[] num_res = new char[Math.max(a.length(), b.length()) + 1];
        StringBuffer sb = new StringBuffer();
        int posi = Math.max(a.length(), b.length());
        int aPosi = a.length()-1;
        int bPosi = b.length()-1;
        int addOne = 0;
        while(posi >= 0 & aPosi>= 0 & bPosi >= 0){
            if (a.charAt(aPosi) == '1' && b.charAt(bPosi) == '1'){
                if (addOne == 0){
                    num_res[posi] = '0';
                    addOne = 1;
                }else{
                    num_res[posi] = '1';
                }
                posi--;
                aPosi--;
                bPosi--;
            }
            else if(a.charAt(aPosi) == '0' && b.charAt(bPosi) == '0'){
                if (addOne == 0){
                    num_res[posi] = '0';
                }else{
                    num_res[posi] = '1';
                    addOne = 0;
                }
                posi--;
                aPosi--;
                bPosi--;
            }else{
                if (addOne == 0){
                    num_res[posi] = '1';
                }else{
                    num_res[posi] = '0';
                    addOne = 0;
                }
                posi--;
                aPosi--;
                bPosi--;
            }
        }
        if (bPosi < 0 && aPosi >= 0){
            while(aPosi >= 0){
                if (addOne == 0){
                    num_res[posi] = a.charAt(aPosi);
                }else{
                    if (a.charAt(aPosi) == '1'){
                        num_res[posi] = '0';
                        addOne = 1;
                    }else{
                        num_res[posi] = '1';
                        addOne = 0;
                    }
                }
                posi--;
                aPosi--;
            }
        }
        
        if (aPosi < 0 && bPosi >= 0){
            while(bPosi >= 0){
                if (addOne == 0){
                    num_res[posi] = b.charAt(bPosi);
                }else{
                    if (b.charAt(bPosi) == '1'){
                        num_res[posi] = '0';
                        addOne = 1;
                    }else{
                        num_res[posi] = '1';
                        addOne = 0;
                    }
                }
                posi--;
                bPosi--;
            }
        }
        if (addOne == 1){
            num_res[0] = '1';
        }
        if (num_res[0] != '1'){
            char[] newchararray = Arrays.copyOfRange(num_res,1,num_res.length+1);
            String str_res = String.copyValueOf(newchararray);
            return str_res;
        }
        return new String(num_res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		System.out.println(lc.addBinary1("0", "0"));
		char c = '0';
		int cint = (int)c;
		System.out.println(cint);
		

	}

}
