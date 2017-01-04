import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog>{
	private String name;
	private int age;
	Dog() {
	}
	
	Dog(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getDogName() {
		return name;
	}
	
	public int getDogAge() {
		return age;
	}
	
	@Override
	public int compareTo(Dog d) {
		// TODO Auto-generated method stub
		return (this.name).compareTo(d.name);
	}
	@Override
	public int compare(Dog o1, Dog o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}
}

public class Example {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dog> list = new ArrayList<Dog>();
		
		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));
		
		Collections.sort(list);
		
		for (Dog a : list) {
			System.out.print(a.getDogName() + ", ");
		}
		
		Collections.sort(list, new Dog());
		System.out.println(" ");
		
		for (Dog a : list) {
			System.out.println(a.getDogName() + " : " + a.getDogAge() + ", ");
		}
	}

}
