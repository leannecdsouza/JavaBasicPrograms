import java.util.Scanner;

public class CompareThreeNumbers {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		a = scanner.nextInt();
		System.out.println("Enter 2nd number:");
		b = scanner.nextInt();
		System.out.println("Enter 3rd number:");
		c = scanner.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a + " is greatest.");
		}
		else if (b>a && b>c) {
			System.out.println(b + " is greatest.");
		}
		else if (c>a && c>b) {
			System.out.println(c + " is greatest.");
		} else {
			System.out.println("Something isn't right.");
		}
		
		scanner.close();
	}

}
