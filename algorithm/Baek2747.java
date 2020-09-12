import java.util.Scanner;

public class Baek2747 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int a = 0;
		int b = 1;
		
		if (n == 0 || n == 1) {
			result = n;
		} else {
			for (int i = 0; i <= n-2; i++) {
				result = a + b;
				a = b;
				b = result;
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
