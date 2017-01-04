
public class Solution {

	public int strStr(String haystack, String needle) {
        int ret_index = -1;
        if (needle.length() == 0){return 0;}
        if (haystack.length() == 0 & needle.length() != 0){return -1;}
        if (haystack.length() < needle.length() ){return -1;}
        //char firstCharOfNeedle = needle.charAt(0);
        int pointOfHaystack = 0;
        int pointOfNeedle = 0;
        for(;pointOfHaystack < haystack.length() & pointOfNeedle < needle.length();pointOfHaystack++){
            if (needle.charAt(pointOfNeedle) == haystack.charAt(pointOfHaystack) && pointOfNeedle == 0){
                ret_index = pointOfHaystack;
                pointOfNeedle++;
                
            }else if (needle.charAt(pointOfNeedle) != haystack.charAt(pointOfHaystack) && pointOfNeedle > 0){
                pointOfHaystack = ret_index+1;
                ret_index = -1;
                pointOfNeedle = 0;
            }
            else if(needle.charAt(pointOfNeedle) == haystack.charAt(pointOfHaystack) && pointOfNeedle == needle.length()-1){
                return ret_index;
            }
            else if(needle.charAt(pointOfNeedle) != haystack.charAt(pointOfHaystack) && pointOfNeedle == 0 ){
                ret_index = -1;
                
            }
            else{
                pointOfNeedle++;
            }
        }
        if (pointOfNeedle != needle.length()){
            return -1;
        }
        return ret_index;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		String str1 = "mississippi";
		String str2 = "pi";
		System.out.println(lc.strStr(str1, str2));
	}

}
