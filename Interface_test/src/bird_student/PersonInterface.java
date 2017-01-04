package bird_student;

public class PersonInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student();
		p.eat();
		p.sleep();
		p = new Teacher();
		p.eat();
		p.sleep();
		p = new Parent();
		p.eat();
		p.sleep();
	}

}

class Student implements Person{
	public void eat(){
		System.out.println("学生去食堂吃饭！");
	}
	public void sleep(){
		System.out.println("学生去寝室睡觉！");
	}
}
class Teacher implements Person{
	public void eat(){
		System.out.println("教师去教师食堂吃饭！");
	}
	public void sleep(){
		System.out.println("教师去公寓睡觉！");
	}
}
class Parent implements Person{
	public void eat(){
		System.out.println("家长去招待所吃饭！");
	}
	public void sleep(){
		System.out.println("家长去招待所睡觉！");
	}
}
