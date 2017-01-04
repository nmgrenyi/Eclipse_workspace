
public class Solution {
	public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        if (digits[n] == 9){
            int i;
            for (i=n;i>=0 && digits[i] == 9;--i){
                digits[i] = 0;
            }
            if(i>=0){
                digits[i] = digits[i]+1;
            }else{
                int[] digits_2 = new int[n+1];
                digits_2[0]=1;
                for(int j=1;j<=n;j++){
                    digits_2[j] = 0;
                }
                return digits_2;
            }
        }else{
            digits[n] += 1;
            return digits;
        }
        return null;
    }
	
	public void printlist(int[] a){
		for(int k : a){
			System.out.print(k);
		}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		int [] digits = {99};
		lc.printlist(lc.plusOne(digits));
	}

}
