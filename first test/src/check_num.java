import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Iterator;
import java.util.List;
import java.util.Set;  
import java.util.Map.Entry; 

public class check_num {
	
	HashMap<Integer, String > map = new HashMap<Integer, String>();
	ArrayList list = new ArrayList();
	String s = new String("ABCDE");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		check_num ck = new check_num();
		ck.map.put(1, "abcdefg");
		ck.map.g
		System.out.println(ck.map.get(1));
		System.out.println("please input the number needs to be checked: ");
		Scanner in = new Scanner(System.in);
		int [] a = {100,99,98,97,95,94,93,92,90,88,86,85};
		int x = in.nextInt();
		int flag = 0;
		
//		for (int i=0;i<a.length;i++)
//		{
//			if (x == a[i])
//			{
//				flag = 1;
//				
//			}
//			
//		}
		
		for (int k: a)
		{
			if (x == k)
			{
				flag = 1;
			}
		}
		
		if (flag == 1)
		{
			System.out.println(x + " is in the array");
		}
		else
		{
			System.out.println(x + " is NOT in the array");
			
		}
	}

}
