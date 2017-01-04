import java.util.Scanner;

public class prime_num_fast_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input a number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean [] num = new boolean [n];
		
		for (int i=0 ;i<n;i++)
		{
			num [i] = true;
		}
		
		int x = 2;
		for (;x<n;x++)
		{
//			int isPrime = 1;
//			for (int k=2;k<Math.sqrt(x);k++)
			for (int k=2;k<x;k++)
			{
				if(x%k == 0)
				{
//					isPrime = 0;
					num[x] = false;
					for (int i=2;x*i<n;i++)
					{
						num[x*i] = false;
					}
				}
			}
			
		}
		
		for (int j=0;j<n;j++)
		{
			System.out.println(j+"is prime?"+num[j]);
		}
	}

}
