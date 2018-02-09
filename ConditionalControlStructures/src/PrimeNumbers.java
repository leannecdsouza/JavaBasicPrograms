import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String ans = "";
		for(int i=2; i<=a/2; i++) {
			if(a%i==0) {
				ans = "Composite";
			} else {
				ans = "Prime";
			}
		}
		System.out.println(ans);
		s.close();
		
	}

}
