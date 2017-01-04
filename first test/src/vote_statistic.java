import java.util.Scanner;

public class vote_statistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input a number bewteen 0 and 9:");
		Scanner in = new Scanner(System.in);
		int [] frequency = new int [10];
		
		for(int i=0;i<frequency.length;i++)
		{
			frequency[i] = 0;
		}
		
		int x = in.nextInt();
		while (x != -1)
		{
			frequency[x] = frequency[x] + 1;
			x = in.nextInt();
		}
		for (int i=0;i<frequency.length;i++)
		{
			System.out.println(i + " " + frequency[i]);
		}
	}

}
