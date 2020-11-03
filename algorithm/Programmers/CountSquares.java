public class CountSquares {
    public static void main(String[] args) {
        CountSquares cs = new CountSquares();
        System.out.println(cs.solution(8, 12));
    }
    public long solution(int w, int h) {
        long answer;
        long m = w;
        long n = h;

        answer = m * n - (m + n - gcd(m, n));

        return answer;
    }

    public static long gcd(long w, long h) {
        long a;
        long b;

        if (w >= h) {
            a = w;
            b = h;
        } else {
            a = h;
            b = w;
        }

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
