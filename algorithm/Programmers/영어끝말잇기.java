import java.util.Arrays;

public class Main {
	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		String a, b;
		
		/*
		 * 보통 반복문을 사용하다가 일정 조건을 만족시켜 더 이상 반복이 필요 없을 때 break 문을 사용해 반복문을 종료 시키는데,
		 * 중첩된 반복문을 사용할 때 일정 조건을 만족시키면 가장 가까운 반복문을 종료하는 게 아니라 
		 * 특정 반복문으로 되돌아가서 반복문을 종료할 때 Label을 이용함.
		 */

		/*
		 * 둘 중에 하나라도 걸리는 애 있으면 바로 초기 반복문 break 시킬 수 있도록 초기 19 Line에 Label로 a라고 매기고,
		 * break 하고자하는 곳에 a 달아 놓음(26 Line, 35Line)
		 * 그래야 탈락자 여러명 생길 때 맨 첫번째 탈락자를 추출할 수 있게됨
		 */ 
		a:for (int i = 1; i < words.length; i++) {
			a = words[i-1];
			b = words[i];

			if ((a.charAt(a.length() - 1) != b.charAt(0))) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break a;
			}
			
			String pivot = words[i];
			int j = 0;
			while (i > j) {
				if (words[j].equals(pivot)) {
					answer[0] = (i % n) + 1;
					answer[1] = (i / n) + 1;
					break a;
				} else
					j++;
			}
			
		}


		return answer;
	}

	public static void main(String[] args) {
		String wd[] = { "hello", "one", "even", "never", "rain", "now", "world", "rabbit" };
		int num = 2;
		System.out.println(Arrays.toString(solution(num, wd)));

		String wd1[] = {"tank", "kick", "know", "wheel", "amy", "dream", "mother", "robot", "tank"};
		int num1 = 2;
		System.out.println(Arrays.toString(solution(num1, wd1)));

		String wd2[] = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		int num2 = 3;
		System.out.println(Arrays.toString(solution(num2, wd2)));
	}
}
