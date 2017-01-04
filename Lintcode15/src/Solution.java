import java.util.ArrayList;

public class Solution {
	
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.size() == 0) {return res;}
        ArrayList<Integer> list = new ArrayList<Integer>(nums.get(0));
        int pos = 0;
        
        permuteHelper(res, list, nums, pos);
        
        return res;
    }
    
    public void permuteHelper(ArrayList<ArrayList<Integer>> res, 
                              ArrayList<Integer> list, 
                              ArrayList<Integer> nums, 
                              int pos) {
        if (list.size() == nums.size()) {
            res.add(new ArrayList<Integer>(list));
        }
        
        for (int i = 0; i < nums.size(); i++) {
            //if (list.contains(nums.get(i))) {
            //    continue;
            //}
            if (i == pos) {
                continue;
            }
            list.add(nums.get(i));
            permuteHelper(res, list, nums, i + 1);
            list.remove(list.size() - 1);
            /*
            if (i < nums.size() - 1) {
                int tmp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, tmp);
            }
            */
        }
        /*
        if (list.size() == nums.size() & !res.contains(list)) {
            res.add(new ArrayList<Integer>(list));
        }
        */
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		Solution lc = new Solution();
		System.out.println(lc.permute(nums));
	}

}
