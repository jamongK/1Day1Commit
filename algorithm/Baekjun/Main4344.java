import java.io.*;
import java.util.StringTokenizer;

public class Main4344 {
    public static void main(String[] args) throws IOException {
        // 테스트 갯수 C 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        double result[] = new double[c];

        // C 만큼 학생 수 N, N명의 점수 입력 받음.
        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int points[] = new int[N];
            int avg = 0;
            int elite = 0;

            for (int j = 0; j < N; j++) {
                points[j] = Integer.parseInt(st.nextToken());
                avg += points[j];
            }
            avg = avg / N;

            for (int j = 0; j < N; j++) {
                if (points[j] > avg) {
                    elite++;
                }
            }

            result[i] = Math.round((double) elite / N * 100 * 1000) / 1000.0;

        }

        br.close();
        
        for (int i = 0; i < result.length; i++) {
            bw.append(String.format("%.3f%%", result[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
