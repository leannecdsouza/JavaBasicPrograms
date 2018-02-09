import java.util.Scanner;

public class InsertAtCertainPosition {

	public static void main(String[] args) {
		
		int num[] = {22, 44, 7, 5, 897, 345, 23};
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = s.nextInt();
		
		System.out.println("Which position?");
		int pos = s.nextInt();

		num[pos]=a;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		s.close();
	}

}
