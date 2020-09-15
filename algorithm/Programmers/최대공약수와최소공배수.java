class Solution {
    public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int big = 0;
    	int small = 0;
    	
    	if (n >= m) {
			big = n;
			small = m;
		} else {
			big = n;
			small = m;
		}
    	
		answer[0] = gcd(big, small);
		answer[1] = n * m / gcd(big, small);

		return answer;
	}

	public int gcd(int a, int b) {
		int value = 0;
		
		if (a % b == 0) {
			value = b;
		} else {
			for (int i = 1; i < b; i++) {
				if (a % i == 0 && b % i == 0) {
					value = i;
				}
			}
		}
		
		return value;
	}
}
