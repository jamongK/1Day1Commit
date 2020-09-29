import java.util.*;
import java.io.*;

public class Baek1717 {
	public static int[] parent; // -> [N]
	
	public static int find(int x) {
		if (x == parent[x])
			return x;
		else
			return parent[x] = find(parent[x]);
	}

	public static void union(int x, int y) {
		x = find(x); // p[x] = x, p[y] = y이고, x < y일때 이 둘을 이어주는 과정에 대한 메소드
		y = find(y); 
		// 같은 부모를 가지고 있지 않을 때
		if (x != y) {
			// y가 x 보다 크다는 것을 가정한다면 아래와 같이 표현 ---> 대소 비교해서 parent 결정하는 부분 넣기
			parent[y] = x;
		}
	}

	// 같은 부모 노드를 가지는지 확인
	public static String isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return "YES";
		else
			return "NO";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1]; // N 이하의 자연수 또는 0이며 같을 수도 있다. --> n + 1
		
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i; // 일단 처음엔 부모배열 값에 자기자신 넣음
		}
		
		for (int i = 0; i < m; i++) {
			StringTokenizer sb = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(sb.nextToken());
			int x = Integer.parseInt(sb.nextToken());
			int y = Integer.parseInt(sb.nextToken());
			
			if (a == 0) {
				union(x, y);
			} else {
				System.out.println(isSameParent(x, y));
			}
		}
	}
}
