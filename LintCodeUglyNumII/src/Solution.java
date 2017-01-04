import java.util.ArrayList;

public class Solution {
	
    public int nthUglyNumber(int n) {
        // Write your code here
        ArrayList<Integer> UglyList = new ArrayList<>();
        UglyList.add(1);
        UglyList.add(2);
        int number = 3;
        ArrayList<Integer> factors = new ArrayList<>();
        while(UglyList.size() <= n) {
            UglyList.add(number);
            for(int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    factors.add(i);
                }
            }
            for(int factor : factors) {
                if (factor == 2) {
                    
                }
                else if(factor == 3) {
                    
                }
                else if(factor == 5) {
                    
                }else{
                    UglyList.remove(UglyList.size() - 1);
                    number++;
                    break;
                }
            }
            number++;
            factors.clear();
        }
        //System.out.print(factor)
        //for(int i : UglyList) {
        //    System.out.println(i);
        //}
        return UglyList.get(n - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int res = solution.nthUglyNumber(9);
		System.out.println(res);

	}

}
