import java.util.*;
import java.io.*;

public class Baek10867 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 절대 while문에 넣으면 안됨.
		
		Set<Integer> set = new TreeSet<Integer>(); // 순서X, 중복제거, 자동 오름차순 정렬 (HashSet은 TreeSet처럼 자동 오름차순 정렬 X)
		
		while(N-->0) { // N-- > 0 ------> N--; N > 0;을 합쳐놓은 것
			int num = Integer.parseInt(st.nextToken());
			set.add(num);
		}
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
