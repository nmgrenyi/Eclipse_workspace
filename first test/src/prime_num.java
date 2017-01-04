import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int n=2;n<=100;n++)
		{
//			System.out.println("please input a number: ");
//			Scanner in = new Scanner(System.in);
//			int n = in.nextInt();
			int factor = 2;
			int reminder;

			for(;factor <= n-1;factor++)
			{
				reminder = n % factor;
				if (reminder == 0)
				{
//					System.out.println(n +" is NOT a prime number!");
					break;
				}
				if (reminder != 0 & factor == n-1)
				{
					System.out.println(n + " is a prime number!");
				}
			}
		}
	}

}
