import java.util.HashSet;
import java.util.Set;

/**
 * 1점
 *
 * 1. 중복제거
 * 2. 선택하려는 포켓몬 수보다 적은 포켓몬 종류 --> answer = 포켓몬 종류 수
 *    선택하려는 포켓몬 수보다 큰 포켓몬 종류 --> answer = 선택하려는 포켓몬 수
 */
public class Ponketmon {
    public int solution(int[] nums) {
        int answer = 0;
        //문제에서 N/2값을 n에 저장
        int n = nums.length / 2;

        //중복제거
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        if (set.size() > n)
            answer = n;
        else
            answer = set.size();

        return answer;
    }
}
