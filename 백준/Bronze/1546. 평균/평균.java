import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max) max = arr[i];
        }

        for (int i : arr) {
            sum += (double)i / max * 100;
        }

        sb.append(sum/n);

        bw.write(sb.toString());
        bw.flush();
    }
}
