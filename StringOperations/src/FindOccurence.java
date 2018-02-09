import java.util.Scanner;

public class FindOccurence {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String line = s.nextLine();
		System.out.println("What to look for?");
		String alphabet = s.next();
		String let;
		int count = 0;
		
		for(int i=0; i<line.length(); i++) {
			let = line.substring(i, i+1);
			if (let.equalsIgnoreCase(alphabet)) {
				count++;
			}
		}
		System.out.println(alphabet + " occurs " + count + " times.");
		s.close();
	}

}
