
public class leetcode258_2 {

	public static int addDigits(int num){
		return num-9*((num-1)/9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("leetcode258_2.main(): "+addDigits(39999));
	}

}
