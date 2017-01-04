
public class prime_num_fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prime = new int [50];
		prime[0] = 2;
		int cnt = 1;
		for (int i=3;cnt<50;i+=2)
		{
			int isPrime = 1;
			for (int k=0;k<cnt;k++)
			{
				if (i%prime[k] == 0)
				{
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1)
			{
				prime[cnt] = i;
				cnt +=1;
			}
		}
		
		for(int j: prime)
		{
			System.out.print(j+",");
		}

	}

}
