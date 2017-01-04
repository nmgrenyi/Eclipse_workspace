import java.util.Scanner;

public class testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit = 100;
		int num1 = 15;
		int num2 = 40;
		if ( limit <= limit)
		{
		    if ( num1 == num2 )
		        System.out.println("lemon");
		    System.out.println("lime");
		}
		System.out.println("grape");
		
		System.out.println("testcase.main()");
		
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch (type)
		{
		case 1:
		case 2:
			System.out.println("nihao");
			break;
		case 3:
			System.out.println("wanshanghao");
		case 4:
			System.out.println("zaijian");
			break;
		default:
			System.out.println("a,sma");
			break;
		}
	}

}
