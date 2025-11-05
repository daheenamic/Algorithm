import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] scores = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
                sum += scores[i];
            }

            double avg = sum / (double) n;

            int cnt = 0;
            for (int s : scores) {
                if (s > avg) cnt++;
            }

            double percent = cnt * 100.0 / n;
            sb.append(String.format("%.3f%%\n", percent));
        }

        System.out.print(sb);
    }
}