public class Main {
	public static int[] parent = new int[1000001];

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
			// y가 x 보다 크다는 것을 가정한다면 아래와 같이 표현
			parent[y] = x;
		}
	}

	// 같은 부모 노드를 가지는지 확인
	public static boolean isSameParent(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			parent[i] = i;
		}
		union(1, 2);
		union(2, 3);
		System.out.println("1과 3은 연결되어 있나요? " + isSameParent(1, 3));
	}
}
