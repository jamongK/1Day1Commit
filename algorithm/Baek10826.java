import java.math.BigInteger;
import java.io.*;

// 2748번 문제 풀이 방식으로 품.
// 단, 입력하는 숫자는 int형

public class Baek10826 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // read()는 한 글자, readLine()은 한 행을 읽어 들임.
		BigInteger result = BigInteger.ZERO; // Fn (= Fn-2 + Fn-1)
		BigInteger a = BigInteger.ZERO; // Fn-2
		BigInteger b = BigInteger.ONE; // Fn-1
		String answer = ""; // result를 String으로 변환한 값을 저장할 변수
		
		if (n == 0) {
			result = a;
		} else if (n == 1) {
			result = b;
		} else {
			for (int i = 0; i <= n-2; i++) {
				result = a.add(b); // BigInteger는 a+b같은 방식이 아닌, a.add(b)처럼 작성해야함.
				a = b;
				b = result;
			}
		}
		
		answer = String.valueOf(result);
		
		bw.write(answer);
		bw.flush();
		bw.close();
		
		// BigInteger fibonacci[] = new BigInteger[N + 3];
		// bw.write(fibonacci[N] + "");
		// Line 37처럼 + ""를 해야 오류가 없어지던데 해당 부분에 대한 설명이 많지 않음.
		// 그래서 그냥 result를 String으로 형변환해 출력하는 방식 사용함.
	}
}
