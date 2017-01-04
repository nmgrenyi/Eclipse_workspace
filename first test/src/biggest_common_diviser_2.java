import java.util.Scanner;

public class biggest_common_diviser_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input the first number:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("please input the second number:");
		int b = in.nextInt();
		int reminder;
		
		if (b == 0)
		{
			System.out.println("biggest_common_diviser is: "+ a);
		}
		
		OUT:
		while(true)
		{
			if (b == 0)
			{
				System.out.println("biggest_common_diviser is: "+ a);
				break OUT;
			}
			else
			{
				reminder = a % b;
				a = b;
				b = reminder;
			}
		}
	}

}
