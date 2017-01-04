package notebook;

import java.util.ArrayList;
import java.util.HashSet;

class Value{
	private int i;
	public void set(int i){this.i = i;}
	public int get(){return i;}
	}

public class NoteBook {
	
	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	
	public void add(String s, int location)
	{
		notes.add(location, s);
	}
	
	public int getSize()
	{
		return notes.size();
	}
	
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	public String[] list()
	{
		String[] a = new String[notes.size()];
//		for (int i=0; i<notes.size();i++)
//		{
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a =new ArrayList<String>();
		a.add("First");
		a.add("Second");
		a.add("Second");
//		for(String s : a){
			System.out.println(a);
//		}
		
		HashSet<String> s = new HashSet <String>();
		s.add("first");
		s.add("second");
		s.add("first");
		System.out.println(s);
		
//		Value [] a = new Value [10];
//		for (int i=0;i<a.length;i++){
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for (Value v : a){
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for(Value v : a){
//			System.out.println(v.get());
//		}
		
		
		
//		String [] a = new String[2];
//		a[0] = "first";
//		a[1] = "second";
		
//		NoteBook nb = new NoteBook();
//		nb.add("first");
//		nb.add("Second");
//		nb.add("third", 1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		System.out.println(nb.getNote(1));
//		System.out.println(nb.getNote(2));
//		nb.removeNote(1);
//		
////		System.out.println(nb.list());
//		String[] a = nb.list();
//		for (String s : a)
//		{
//			System.out.println(s);
//		}
//		System.out.println(a[2]);
		
	}

}
