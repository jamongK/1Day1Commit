/**
 * 이진 변환 반복
 */
public class ConvertToBinary {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int c = 0; // 0을 제거한 후의 s의 길이

        while (!s.equals("1")) { // s != "1" --> 이렇게 하면 안됌 String
            int deletedZero = 0; // 0 제거 횟수
            answer[0]++;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    deletedZero++;
                }
            }
            answer[1] += deletedZero;

            c = s.length() - deletedZero;
            s = Integer.toBinaryString(c);
        }

        return answer;
    }
}
