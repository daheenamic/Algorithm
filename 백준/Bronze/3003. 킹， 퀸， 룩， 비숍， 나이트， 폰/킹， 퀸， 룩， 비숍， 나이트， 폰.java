import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] piece = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < piece.length; i++) {
            sb.append(piece[i] - Integer.parseInt(st.nextToken())).append(" ");
        }

        System.out.println(sb);
    }
}