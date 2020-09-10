import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		
		while (true) {
			// 변 3개 길이 입력
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int arr[] = {a, b, c}; // 변 3개를 배열 원소로 집어넣음
			Arrays.sort(arr); // 오름차순 정렬
			
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break; // 0, 0, 0 입력할 경우
			} else if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}	
		
		sc.close();
	}
}
