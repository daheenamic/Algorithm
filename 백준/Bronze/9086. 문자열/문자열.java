import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] c = br.readLine().toCharArray();
            sb.append(c[0]).append(c[c.length-1]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}