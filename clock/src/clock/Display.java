package clock;

public class Display {
	private int value = 0;
	private int limit = 0;
	private static int step = 1;
	
	public Display(int limit)
	{
		this.limit = limit;
	}
	
	public void increase()
	{
		value++;
		if (value == limit)
		{
			value = 0;
		}
	}
	
	public int getValue()
	{
		return value;
	}
	
	public static int f(int steps)
	{
		step = steps;
		return step;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Display d = new Display(24);
//		Display e = new Display(60);
//		for (;;)
//		{
//			e.increase();
//			if (e.value == 59)
//			{
//				d.increase();
//			}
//			System.out.println(d.getValue()+":"+e.getValue());
//		}
		System.out.println(Display.step);
		Display d1 = new Display(10);
		d1.step = 2;
		System.out.println(d1.step);
		Display d2 = new Display(20);
		System.out.println(d2.step);
//		f();
//		d1.f();
//		d2.f();
		
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d2.step);
		System.out.println(d2.step);
		d1.step = 3;
		System.out.println(d1.step);
		System.out.println(d2.step);
	}

}
