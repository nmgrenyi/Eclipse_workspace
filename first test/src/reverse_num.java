import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input a number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int left_num = num;
		int unit;
		int reverse_unit = 0;
		
		while (left_num != 0)
		{
			unit = left_num % 10;
			System.out.println(unit);
			left_num = left_num / 10;
			reverse_unit = reverse_unit * 10 + unit;
		}
		System.out.println("re" + reverse_unit);
	}

}
