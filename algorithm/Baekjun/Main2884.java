import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int alMin = 0;
        int alHr = 0;

        if (M < 45) {
            alMin = 15 + M;
            if (H < 1) {
                alHr = 23;
            } else {
                alHr = H - 1;
            }
        } else {
            alHr = H;
            alMin = M - 45;
        }

        System.out.println(alHr + " " + alMin);
    }

}
