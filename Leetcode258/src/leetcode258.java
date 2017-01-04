
public class leetcode258 {
	
	public static int addDigits(int num){
		return (num - 1)%9 + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("leetcode258:" + addDigits(8));
	}

}
