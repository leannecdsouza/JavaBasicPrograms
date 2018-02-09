import java.util.Scanner;

public class CompareManyNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = 0, great = 0;
		
		while(scan.hasNext()) {
			a = scan.nextInt();
			if(a > great) {
				System.out.println(a + " is the greatest number.");
				great = a;
			} else {
				System.out.println(great + " is still the greatest number.");
			}
			
		}
		scan.close();
	}

}
