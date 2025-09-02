import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #")
                    .append(i + 1)
                    .append(": ")
                    .append(a)
                    .append(" + ")
                    .append(b)
                    .append(" = ")
                    .append(a + b)
                    .append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
