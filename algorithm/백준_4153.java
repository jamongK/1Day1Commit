import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int arr[] = {a, b, c};
			Arrays.sort(arr);
			
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			} else if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}	
		
		sc.close();
	}
}
