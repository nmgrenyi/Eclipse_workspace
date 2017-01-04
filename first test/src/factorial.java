import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input: n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 1;
		float total = 1;
		
//		if (n > 1){
//			do {
//				total = total * n;
//				n = n -1;
//			}
//			while (n != a);
//		}
//		System.out.println(total);
		
		
		for (a=1; a<=n; a=a+1)
		{
			total = total * a;
		}
		System.out.println(total);
	}

}
