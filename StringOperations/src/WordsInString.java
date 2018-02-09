import java.util.Scanner;

public class WordsInString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a sentence:");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine();
		String words[]=sentence.split(" ");
		System.out.println(words.length);
		s.close();
	}
}
