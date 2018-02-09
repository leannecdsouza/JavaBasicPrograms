import java.util.Scanner;

public class FirstLetterCapital {

	public static void main(String[] args) {
		
		String cap;
		System.out.println("Enter a sentence:");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		String words[]=sentence.split(" ");
		for(int i=0; i<words.length; i++) {
			cap = words[i].substring(0, 1).toUpperCase();
			System.out.print(cap + " ");
		}
		s.close();
		
	}

}
