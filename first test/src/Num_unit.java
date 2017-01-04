import java.lang.reflect.Array;
import java.util.Scanner;

public class Num_unit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(false)
//		{
//			System.out.println("请输入一个数字");
//			Scanner in = new Scanner(System.in);
//			int num = in.nextInt();
//			int unit = 0;
//			do
//			{
//				unit = unit + 1;
//				num = num/10;
//				System.out.println("unit= "+ unit + ";" + "num=" + num);
//			} while( num > 0);
//			System.out.println(unit);
//		}
		
//		int count = 100;
//		while(count >= 0){
//			count = count -1;
//			System.out.println(count);
//		}
//		System.out.println("fashe");
		
		
		
		System.out.println("请输入需要计算的平均数的个数");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("请输入需要计算的平均数");
		int total = 0;
		int [] numbers = new int[n];
		int cnt = 0;
		int number = in.nextInt();
		
//		while (number != -1)
		while (cnt < 10)
		{
			numbers[cnt] = number;
			total = total + number;
//			n = n + 1;
			cnt = cnt + 1;
			if(cnt >= 10)
			{
				break;
			}
			number = in.nextInt();
		}
		if(cnt > 0)
		{
			double avg;
			avg = (double)(total)/cnt;
			System.out.println("avg:" + avg);
			for (int i=0;i<numbers.length;i++)
			{
				if (numbers[i] >= avg)
				{
					System.out.print(numbers[i]+",");
				}
//				System.out.println("numbers.length:"+numbers.length);
			}
		}
	}

}
