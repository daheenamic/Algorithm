import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = b-45;

        if(c < 0) {
            if(a == 0) a = 24;
            a--;
            b = 60+(c);
        } else {
            b = c;
        }

        bw.write(a+" "+b);
        bw.flush();
        bw.close();
        br.close();
    }
}
