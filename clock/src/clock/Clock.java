package clock;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
//	Display.step = 10;
	
//	private int hour_step = hour.f(12);
//	private int munite_step = minute.f(60);
	
//	public static void print_step()
//	{
//		System.out.println(hour_step);
//	}
	
	public void start()	
	{
		while(true)
		{
			minute.increase();
			
			
			try
			{
				Thread.sleep(10);
			}catch(InterruptedException e){
				
			}
			
			
			if (minute.getValue() == 0)
			{
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		clock.start();
		
//		print_step();

	}

}
