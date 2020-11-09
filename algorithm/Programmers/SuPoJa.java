import java.util.ArrayList;
import java.util.List;

public class SuPoJa {

    /**
     * answers --> 문제 정답 배열
     * answer --> 가장 문제 많이 맞힌 사람
     */
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3]; // cnt[0] --> a의 정답갯수 이런식

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                cnt[0]++;
            }

            if (answers[i] == b[i % b.length]) {
                cnt[1]++;
            }

            if (answers[i] == c[i % c.length]) {
                cnt[2]++;
            }
        }

        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < cnt.length; i++) {
            if (max == cnt[i]) {
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
