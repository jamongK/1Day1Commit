import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1110Review {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        if (x >= 0 && x <= 99) {
            int ans = x;
            int cycle = 0;

            do {
                cycle++;

                if (ans < 10) {
                    ans = (ans * 10) + ans;
                } else {
                    ans = ((ans % 10) * 10) + (((ans / 10) + (ans % 10)) % 10);
                }
            } while (x != ans);

            System.out.println(cycle);

        }

    }
}
