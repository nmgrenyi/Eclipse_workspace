import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			System.out.println("input X:");
			Scanner X = new Scanner(System.in);
			
			System.out.println("input Y:");
			Scanner Y = new Scanner(System.in);
			
			System.out.println("input Z:");
			Scanner Z = new Scanner(System.in);
			
			int max;
			int x = X.nextInt();
			int y = Y.nextInt();
			int z = Z.nextInt();
			
			if (x > y){
				max = x;
				if (x < z){
					max = z;
				}
			}
			else{
				max = y;
				if (y < z){
					max = z;
				}
			}
			
			System.out.println(max);
	}

}
