import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Answer2231 {
	public static void main(String[] args) throws IOException {
		// 245 --> 245 + 2 + 4 + 5 = 256
		// 256을 입력하면 245가 뜨도록 하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dcmp = 0;
		int ans = 0;
		
		for (int i = 0; i <= n; i++) {
			dcmp = lineSum(i);
			if (i + dcmp == n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
	
	public static int lineSum(int n) {
		int result = 0;
		while(n > 0) {
			result += n % 10;
            n /= 10;
        }
		return result;
	}
}
