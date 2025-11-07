import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] piece = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int j : piece) {
            sb.append(j - Integer.parseInt(st.nextToken())).append(" ");
        }

        System.out.println(sb);
    }
}