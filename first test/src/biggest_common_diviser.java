import java.util.Scanner;

public class biggest_common_diviser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input the first number:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("please input the second number:");
		int b = in.nextInt();
		int min;
		boolean sign = false;
		
		if (a>b)
		{
			min = b;
		}
		else
		{
			min = a;
		}
		
		for (int i=min;i>=2;i--)
		{
			if (a%i == 0 && b%i ==0)
			{
				System.out.println("biggest_common_diviser is:"+i);
				sign = true;
				break;
			}
		}
		if (sign == false)
		{
			System.out.println("No biggest_common_diviser");
		}
	}

}
