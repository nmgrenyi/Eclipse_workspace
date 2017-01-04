
public class Solution {

	public boolean validUtf8(int[] data) {
        Boolean isValid = true;
        int count = 0;
        for(int i = data.length - 1; i >=0; i--) {
            if (data[i] <= 127) {
                continue;
            }else if ((data[i] >= 128) && (data[i] <= 240)) {
                if ((data[i] >= 128) && (data[i] <= 191)) {
                    count++;
                }else{
                    data[i] = data[i] >> (8 - count - 2);
                    if ((data[i] & 1) == 0) {
                        data[i] = data[i]>>1;
                        for (int j = 0; j < count ; j++) {
                            if ((data[i] & 1) == 1) {
                                data[i] = data[i]>>1;
                                continue;
                            }else{
                                isValid = false;
                                break;
                            }
                        }
                        count = 0;
                    }else{
                        isValid = false;
                        break;
                    }
                }
            }else {
                isValid = false;
            }
        }
        if (count >= 1) {
            isValid = false;
        }
        return isValid;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		int[] data = {194,155,231,184,185,246,176,131,161,222,174,227,162,134,241,154,168,185,218,178,229,187,139,246,178,187,139,204,146,225,148,179,245,139,172,134,193,156,233,131,154,240,166,188,190,216,150,230,145,144,240,167,140,163,221,190,238,168,139,241,154,159,164,199,170,224,173,140,244,182,143,134,206,181,227,172,141,241,146,159,170,202,134,230,142,163,244,172,140,191};
		boolean res = solution.validUtf8(data);
		System.out.println(res);
	}

}
