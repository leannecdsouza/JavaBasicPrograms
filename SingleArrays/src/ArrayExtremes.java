
public class ArrayExtremes {

	public static void main(String[] args) {
		
		int num[] = {22, 44, 7, 5, 897, 345, 23};
		int biggest = num[0], smallest = num[0], i = 0;
		
		while(i < num.length) {
			if (num[i]>biggest) {
				biggest = num[i];
			}
			else if (num[i]<smallest) {
				smallest = num[i];
			}
			i++;
		}
		System.out.println("Smallest:"+smallest+" Biggest:"+biggest);
	}

}
