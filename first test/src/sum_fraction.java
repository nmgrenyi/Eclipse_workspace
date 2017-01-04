import java.util.Scanner;

public class sum_fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input the n:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double fraction;
		double total = 0;
		
		for (int i=1;i<=n;i++)
		{
			fraction = (1.0/i)*Math.pow(-1, i+1);
			total = total + fraction;
		}
		System.out.printf("sum of the fraction from 1 to 1/"+n+" is: "+ "%.2f",total);

	}

}
