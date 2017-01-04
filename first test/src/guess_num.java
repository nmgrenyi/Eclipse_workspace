import java.util.Random;
import java.util.Scanner;

public class guess_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(37/10);
		
		System.out.println("请输入一个数：");
		java.util.Random random = new java.util.Random();
		final int num = random.nextInt(10);
		final int num_real = num + 1;
		int input_num;
		Scanner in = new Scanner(System.in);
		input_num = in.nextInt();
		
		while (input_num != num_real)
		{
			if (input_num > num_real)
			{
				System.out.println("too big");
			}
			else
			{
				System.out.println("too small");
			}
			input_num = in.nextInt();
		}
		
		System.out.println("Yes, you are right!");
		
	}

}
