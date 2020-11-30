import java.util.Arrays;

public class NLcm {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        if (arr.length == 1) { // 해당 if문 생략하고 answer = arr[0]으로 시작해도 된다.
            answer = arr[0];
        } else if (arr.length == 2) {
            answer = lcm(arr[1], arr[0]);
        } else if (arr.length > 2) {
            answer = lcm(arr[1], arr[0]);
            for (int i = 2; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
            }
        }

        return answer;
    }

    public int gcd(int a, int b) { // a가 큰수, b가 작은수
        while (b > 0) { //유클리드 호제법 (b(a를 b로 나눈 나머지)가 0이 될때 까지 돌림. 0이 될때 a가 최대공약수)
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        int n = (a * b) / gcd(a, b);
        return n;
    }
}
