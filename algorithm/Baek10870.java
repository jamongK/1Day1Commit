import java.util.Scanner;

public class Baek10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));
		sc.close();
	}

	public static int fibonacci(int num) {
		if (num == 0 || num == 1) {
			return num;
		} else {
			return fibonacci(num-2) + fibonacci(num-1);
		}
	}
}
