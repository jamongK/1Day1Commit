import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
< 1546번 문제 맞은 사람 1위의 코드 >
for(i=0; i<N; i++) {
    if(score[i]>Max) {
        Max=score[i];
    }
    sum += score[i];
}
System.out.println(sum*100/Max/N);

===============================================================================

Arrays.sort()를 이용하지 않고
for문 + if문으로 최댓값을 조회했으며

시험점수마다 일일이 (시험점수)/(점수최대치)*100를 한 후
이를 다 더한 값에 sum/(시험 본 과목 수) 처리를 하는 것이 아닌
모든 시험 점수를 다 더하고 여기다가 한번에 sum/(점수최대치)*100/(시험 본 과목 수)처리를 함
 */
public class Main1546 {
    public static void main(String[] args) throws IOException {
        double result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double points[] = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < points.length; i++) {
            points[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(points);

        double M = points[points.length - 1];
        for (int i = 0; i < points.length; i++) {
            result += (points[i] / M * 100);
        }
        result /= points.length;

        System.out.println(result);
    }
}
