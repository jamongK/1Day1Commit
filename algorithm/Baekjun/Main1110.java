import java.util.Scanner;

public class Main1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x >= 0 && x <= 99) {
            if (x < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(0);
                sb.append(x);
                x = Integer.parseInt(sb.toString());
            }

            int answer = x;
            int cycle = 0;

            do {
                StringBuilder bd = new StringBuilder();
                int a = answer / 10;
                int b = answer % 10;
                bd.append(b);

                if ((a + b) > 9) {
                    bd.append((a + b) % 10);
                } else {
                    bd.append(a + b);
                }

                answer = Integer.parseInt(bd.toString());
                cycle++;
            } while (x != answer);

            System.out.println(cycle);
        }
    }
}
