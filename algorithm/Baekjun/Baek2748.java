import java.util.Scanner;

public class Baek2748 {
	// 2747번과 달리 비교적 더 큰 숫자도 쓸 수 있도록 int가 아닌, long 자료형을 이용해야 함
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); // 몇 번째 피보나치 수를 출력할 건지 int형 입력
		long result = 0; // Fn(= Fn-2 + Fn-1)
		long a = 0; // Fn-2
		long b = 1; // Fn-1
		
		if (n == 0 || n == 1) {
			result = n; // 입력한 숫자 n이 0이거나 1이면 0, 1을 각각 출력
		} else {
			for (int i = 0; i <= n-2; i++) {
				result = a + b; // Fn = Fn-2 + Fn-1
				a = b; // Fn-2 위치에 Fn-1 값 이동
				b = result; // Fn-1 위치에 Fn 값 이동
			}
		}
		
		System.out.println(result); // 결과(Fn) 출력
		sc.close();
	}
}
