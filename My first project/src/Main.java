import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		初始化
		Scanner in = new Scanner(System.in);
//		读入投币金额
		int balance = 0;
		while(true){
			System.out.println("请投币");
			int amount = in.nextInt();
	//		打印车票
			balance = balance + amount;
			if (balance >= 10)
			{
				System.out.println("****************");
				System.out.println("*Java城际铁路专线*");
				System.out.println("*  无指定座位票  *");
				System.out.println("*  票价  10 元  *");
				System.out.println("****************"); 
	//		计算并打印找零
				System.out.println("找零： " + (balance -10) );
				balance = 0;
			}
			else
			{
				System.out.println("您已经投了： " + balance + "元");
				System.out.println("还差： " + (balance -10));
			}
		}
	}
}