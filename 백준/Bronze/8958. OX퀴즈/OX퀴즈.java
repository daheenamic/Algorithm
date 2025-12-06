import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            int sum = 0;
            int score = 0;

            for (char c : arr) {
                if(c == 'O') score++;
                else score = 0;

                sum += score;
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}