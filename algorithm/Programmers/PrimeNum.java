public class PrimeNum {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;
        int n;

        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    n = nums[i] + nums[j] + nums[k];
                    if (isPrime(n)) answer++;
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int n) {
        boolean flag = true; // 초기값 : true --> 소수 O
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        return flag;
    }
}
