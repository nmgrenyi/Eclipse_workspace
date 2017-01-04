import java.util.ArrayList;
import java.util.List;

public class Solution {

	public boolean isUgly1(int num) {
	       if (num<0){return false;}
	       if (num == 1){
	           return true;
	       }
	       while(num%2==0){num = num/2;}
	       while(num%3==0){num = num/3;}
	       while(num%5==0){num = num/5;}
	       return num == 1;
	    }
	
	
	
	public boolean isUgly(int num) {
        if(num<=0){return false;}
        List<Integer> list = new ArrayList<Integer>(); 
        List<Integer> list_prime = new ArrayList<Integer>(); 
        for(int i=2;i<=num;i++){
            if(num%i == 0){
                list.add(i);
            }
        }
        for(int j : list){
            boolean isPrime = true;
            for(int p=2;p<j;p++){
                if(j %p == 0){
                    isPrime  = false;
                }
                    
            }
            if (isPrime == true){
                list_prime.add(j);
            }
        }
        boolean isUgly_ = true;
        for(int k : list_prime){
            if(k != 2 && k != 3 && k != 5){
                isUgly_ = false;
            }
        }
        return isUgly_;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc263 = new Solution();
		System.out.println(lc263.isUgly1(214797179));
	}

}
