import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < a; k++) {
                    sb.append(arr[j]);
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}