import java.util.Scanner;

public class CompareStrings {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String m = s.next();
		String k = s.next();
		
		if(m.equalsIgnoreCase(k)) {
			System.out.println("They're the same.");
		} else {
			System.out.println("Different strings.");
		}
		
		s.close();
	}

}
