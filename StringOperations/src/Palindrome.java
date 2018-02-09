import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String m = s.next();
		String n = "";
		int l = m.length();
		
		for(int i=l; i>0; i--) {
			n = n + m.substring(i-1, i);
		}
		System.out.println(n);
		s.close();
		
		if(m.equalsIgnoreCase(n)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not");
		}
	}

}
