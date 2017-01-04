
public class Person {

	Chongqiwawa wawa;
	
	public void setWawa(Chongqiwawa wawa){
		this.wawa = wawa;
	}
	
	private String name;
	
	public void makeLove(){
		wawa.makeLove(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person you = new Person();
		Chongqiwawa wawa1 = new USAWawa();
		Chongqiwawa wawa2 = new JapanWawa();
		you.setWawa(wawa2);
		you.setWawa(wawa1);
		
		you.makeLove();
	}

}

class USAWawa implements Chongqiwawa{
	public void makeLove(String name){
		System.out.println(name + "come on! a,a,a...");
	}
}

class JapanWawa implements Chongqiwawa{
	public void makeLove(String name){
		System.out.println(name+"Yameidie...");
	}
}
