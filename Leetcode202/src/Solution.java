
public class Solution {
	public boolean isHappy(int n) {
        int sum = n;
        if (n == 1){return true;}
        int times = 0;
        while(sum != 1 && sum > 0 && sum <=2147464800 && times<100000){
            int total_sum_sqr = 0;
            for(;sum > 0;){
                total_sum_sqr = total_sum_sqr + (int)Math.pow(sum%10,2);
                sum = sum/10;
            }
            if (total_sum_sqr == 1){
                return true;
            }else{
                sum = total_sum_sqr;
                System.out.println(sum);
            }
            times++;
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		System.out.println(lc.isHappy(2));
	}

}
