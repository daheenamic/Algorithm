import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int read = 0;
        
        while (read < n) {
            if (st.hasMoreTokens() == false) {
                st = new StringTokenizer(br.readLine());
                continue;
            }
            int x = Integer.parseInt(st.nextToken());
            if (x < min) min = x;
            if (x > max) max = x;
            read++;
        }

        bw.write(min + " " + max);
        bw.flush();
    }
}
