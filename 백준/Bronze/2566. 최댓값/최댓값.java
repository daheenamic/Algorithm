import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                int value = Integer.parseInt(st.nextToken());
                if(max < value) {
                    max = value;
                    row = i;
                    col = j;
                }
            }
        }
        
        sb.append(max).append("\n").append(row).append(" ").append(col);
        System.out.println(sb);
    }
}