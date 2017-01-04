
public class InBox_OutBox {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 10;
//		Integer j = new Integer(i);
//		int i1 = j.intValue();
//		System.out.println(i1*i1);
		
//		int i = 10;
//		Integer j = i;
////		int i1 = j.intValue();
//		int i1 = j;
//		System.out.println(i1);
		
		String str = "1500";
		try
		{
			int i = Integer.parseInt(str);
			System.out.println(++i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
