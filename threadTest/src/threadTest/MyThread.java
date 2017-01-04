package threadTest;

class MyThread1 extends Thread {

	public void run(){
		System.out.println("MyThread1_1.run()");
		System.out.println("MyThread1_2.run()");
		System.out.println("MyThread1_3.run()");
	}

}

class MyThread2 extends Thread {
	
	public void run(){
		System.out.println("MyThread2_1.run()");
		System.out.println("MyThread2_2.run()");
		System.out.println("MyThread2_3.run()");
	}
}



public class MyThread extends Thread {

	public void run(){
		System.out.println("MyThread.run()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		myThread1.start();
		myThread2.start();
		
	}

}
