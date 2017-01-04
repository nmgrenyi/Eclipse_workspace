
public class prime_num_less100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=100;i++)
		{
			for (int j=2;j<=i-1;j++)
			{
				if (i%j == 0 )
				{
					break;
				}
				else if(i%j != 0 & j == i-1)
				{
					System.out.println("prime_num: "+ i);
					break;
					
				}
			}
		}

	}

}
