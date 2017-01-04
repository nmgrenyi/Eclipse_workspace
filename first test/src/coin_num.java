import java.util.Scanner;

public class coin_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input how much money you need to change:");
		Scanner in = new Scanner(System.in);
		int money_yuan = in.nextInt();
		int money_jiao = money_yuan * 10; 
		int i=0,j=0,k=0,u=0;
		
		for (i=0;i<=money_jiao;i++)
		{
			for (j=0;j<=money_jiao/2;j++)
			{
				for(k=0;k<=money_jiao/5;k++)
				{
					for (u=0;u <= money_jiao/10;u++)
					{
						if (i + j*2 + k*5 + u*10 == money_jiao)
						{
							System.out.println(i+"个1角，"+j+"个2角，"+k+"个5角，"+u+"个1元");
							break;
						}
					}
					if (i + j*2 + k*5 + u*10 == money_jiao)
					{
//						System.out.println(i+"个1角，"+j+"个2角，"+k+"个5角，"+u+"个1元");
						break;
					}
					
				}
				if (i + j*2 + k*5 + u*10 == money_jiao)
				{
//					System.out.println(i+"个1角，"+j+"个2角，"+k+"个5角，"+u+"个1元");
					break;
				}
			}
			if (i + j*2 + k*5 + u*10 == money_jiao)
			{
//				System.out.println(i+"个1角，"+j+"个2角，"+k+"个5角，"+u+"个1元");
				break;
			}
		}
	}

}
