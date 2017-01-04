
public class printPattern2 {

	public static void print2 (int low) {
		for (int i = 1; i <= low; i++) {
			char ch = 'a';
			char print = ch;
			for (int j = 0; j < i; j++) {
				System.out.print(print++);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern2 pp = new printPattern2();
		pp.print2(4);
	}

}
