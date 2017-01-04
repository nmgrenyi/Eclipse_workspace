package leetcode349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++)
			set.add(nums1[i]);
		int[] result = new int[nums2.length];
		int k = 0;
		for (int i = 0; i < nums2.length; i++)
			if (set.contains(nums2[i])) {
				result[k++] = nums2[i];
				set.remove(nums2[i]); //一定要删除
			}
		
		return Arrays.copyOfRange(result, 0, k);
	}

	public int[] intersection2(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] result = new int[nums2.length];
		int i = 0, j = 0, k = 0;
		System.out.println(nums1.length);
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				i++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				result[k++] = nums1[i++];
				while (i < nums1.length && nums1[i] == nums2[j]) i++;
				j++;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leetcode349 lc349 = new Leetcode349();
		int[] intlist1 = {1,2,2,1};
		int[] intlist2 = {1,2,2,1};
		int[] intlist3 = lc349.intersection2(intlist1, intlist2);
		for (int i : intlist3){
			System.out.println(i);
		}
	}

}
