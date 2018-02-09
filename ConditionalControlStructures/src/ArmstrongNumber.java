import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int tot = 0, temp, d;
		
		temp = num;
		while (num > 0) {
			d = num % 10;
			num = num/10;
			tot = tot + (d*d*d);
		}
		
		if (temp == tot) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a armstrong number");
		}
	}

}
