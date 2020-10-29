public class JumpTeleport {
    public static int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 != 0) { // 홀수면 /2 나눠떨어지지 않으니까 -1
                n -= 1;
                ans += 1;
            } else { // 짝수면 /2 나눠떨어지니까 순간이동 가능해서 /2
                n /= 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(solution(a)); // 2

        int b = 6;
        System.out.println(solution(b)); // 2

        int d = 7;
        System.out.println(solution(d)); // 3

        int c = 5000;
        System.out.println(solution(c)); // 5

    }
}
