import java.util.Scanner;

public class Yong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入您的年龄");
		Scanner age = new Scanner(System.in);
		if (age.nextInt() >= 35){
			System.out.println("你的年龄决定你的眼界");
		}else{
			System.out.println("年轻是美好的");
		}

	}

}
