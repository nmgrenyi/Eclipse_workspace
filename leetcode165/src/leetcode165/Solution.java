package leetcode165;

public class Solution {
	
	public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split(".");
        String[] v2 = version2.split(".");
        int[] v1_int = StringToInt(v1);
        int[] v2_int = StringToInt(v2);
        int i = 0;
        int j = 0;
        for(;i<v1_int.length & j<v2_int.length;i++, j++){
            if (v1_int[i] > v2_int[j]){
                return 1;
            }else if(v1_int[i] < v2_int[j]){
                return -1;
            }
        }
        
        if (i == v1_int.length && j == v2_int.length){
            return 0;
        }
        else if (i == v1_int.length && j < v2_int.length){
            for(int k=j;k<v2_int.length;k++){
                if (v2_int[k] > 0){
                    return -1;
                }
            }
            return 0;
        }
        else if (i < v1_int.length && j == v2_int.length){
            for(int k=i;k<v1_int.length;k++){
                if (v1_int[k] > 0){
                    return 1;
                }
            }
            return 0;
        }
        
        return 0;
    }
    
    public int[] StringToInt(String[] v){
        int[] ret = new int[v.length];
        for(int i=0;i<v.length;i++){
            ret[i] = Integer.valueOf(v[i]);
        }
        return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		System.out.println(lc.compareVersion("1", "0"));
	}

}
