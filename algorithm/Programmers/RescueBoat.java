import java.util.Arrays;

public class RescueBoat {
    public int solution(int[] people, int limit) {
        int answer = 0; // 구출에 필요한 최소한의 구명보트 개수

        Arrays.sort(people);

        int h = people.length - 1; // 맨 앞부터 제일 무거운 사람 가리키는 인덱스
        int l = 0; // 맨 뒤부터 제일 가벼운 사람 가리키는 인덱스

        for (int i = 0; i < people.length; i++) {
            answer++; // 일단 구명보트 1 카운트

            int rescued = people[h]; // 무거운 사람 먼저 태우고, limit에 넘지 않게
            h--;

            if ((rescued + people[l]) <= limit) l++;

            if (h < l) break;

        }
        return answer;
    }
}
