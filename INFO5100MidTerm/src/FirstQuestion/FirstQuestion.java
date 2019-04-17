package FirstQuestion;

public class FirstQuestion {
	
	public int[] reverseEvenIndices(int[] nums) {
		
		if (nums == null || nums.length == 0) {
			return nums;
		}
		
		int temp = 0;
		int l = nums.length;

		if (nums.length % 2 == 0) {
			for (int p = 0; p < l - p -2;) {
				temp = nums[p];
				nums[p] = nums[l - p - 2];
				nums[l - p - 2] = temp;
				p += 2;
			}
		}
		else {
			for (int p = 0; p < l - p -1;) {
				temp = nums[p];
				nums[p] = nums[l - p - 1];
				nums[l - p - 1] = temp;
				p += 2;
			}
		}
		return nums;
	}
	
	 private static int[] reverseEvenIndices2(int[] input){
		  if(input == null || input.length == 0){
		   return input;
		  }
		  for(int i = 0; i < input.length/2; i = i+2){
		   if(input.length % 2 == 0){
		   swap(i,input.length - 2 - i, input);
		   }else{
		   swap(i,input.length - 1 - i, input); 
		   }
		  }
		  return input;
		 }

	private static void swap(int i, int j, int[] input) {
		  int temp = 0;
		  temp = input[i];
		  input[i] = input[j];
		  input[j] = temp; 
		 }

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstQuestion fq = new FirstQuestion();
		
		int[] nums0 = null;
		int[] nums1 = {};
		int[] nums2 = {1, 2, 3};
		int[] nums3 = {9, 4, 8, 7, 5, 1, 3};
		int[] nums4 = {6, 4, 1, 0, 3, 2};
		
		
		int[] res = fq.reverseEvenIndices2(nums2);
		
		for (int i : res){
			System.out.println(i);
		}

	}

}
