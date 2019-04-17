
	class Animal { 
	    private String name;  
	    private int id; 
	    public Animal(String myName, int myid) { 
	        name = myName; 
	        id = myid;
	    } 
	    public void eat(){ 
	        System.out.println(name+"正在吃"); 
	    }
	    public void sleep(){
	        System.out.println(name+"正在睡");
	    }
	    public void introduction() { 
	        System.out.println("大家好！我是"         + id + "号" + name + "."); 
	    } 
	}
	
	
	class Penguin extends Animal { 
	    public Penguin(String myName, int myid) { 
	        super(myName, myid); 
	    } 
	}
	
	class Mouse extends Animal { 
	    public Mouse(String myName, int myid) { 
	        super(myName, myid); 
	    } 
	}

public class ExtendTest {
	private int a = 0;
	public int b = 1;
	
	class subClass1{
		private int subClass1_int1;
		public int subClass1_int2;
		public subClass1(int subClass1_int1, int subClass1_int2) {
			this.subClass1_int1 = subClass1_int1;
			this.subClass1_int2 = subClass1_int2;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendTest et = new ExtendTest();
		ExtendTest.subClass1 sc = et.new subClass1(1, 2);
		//subClass1 sc = new subClass1(6, 8);
		
		
		Mouse m = new Mouse("m1", 1);
		m.eat();
	}

}
