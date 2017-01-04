import java.util.HashMap;

public class Student_and_Subject {
	private HashMap<String, Integer> s = new HashMap<String,Integer>();
	
	public Student_and_Subject(){
		s.put("Randy_Math",100);
		s.put("Randy_Chinese",99);
		s.put("Randy_English",98);
		s.put("Lisa_Math",10);
		s.put("Lisa_Chinese",9);
		s.put("Lisa_English",8);
		s.put("Alice_Math",50);
		s.put("Alice_Chinese",49);
	}
	
	public void get_grade(String string){
		for (String sa: s.keySet()){
			if (sa.contains(string)){
				System.out.println("Student_Subject: "+sa+":"+s.get(sa));
			}
			
		}
//		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_and_Subject student_and_subject = new Student_and_Subject();
		student_and_subject.get_grade("Math");
		

	}

}
