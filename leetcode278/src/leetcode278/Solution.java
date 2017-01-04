package leetcode278;

public class Solution {

	public int firstBadVersion(int n) {
        if (n == 1 & isBadVersion(1) == false){return 0;}
        if (n == 1 & isBadVersion(1) == true){return 1;}
        int badVersion = n/2;
        int upbound = n;
        int lowbound = 0;
        boolean findBad = false;
        while(!findBad){
            if (isBadVersion(badVersion) == true ){
                upbound = badVersion;
                if (badVersion == 1){
                    return badVersion;
                }
                else if (isBadVersion(badVersion-1) == false){
                    return badVersion;
                }else {
                    badVersion = (badVersion + lowbound)/2;
                }
            }else{
                lowbound = badVersion;
                badVersion = (badVersion + upbound + 1)/2;
            }
        }
        return 0;
    }
	
	public boolean isBadVersion(int version){
		if (version == 1702766719){
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution lc = new Solution();
		System.out.println(lc.firstBadVersion(2126753390));
	}

}
