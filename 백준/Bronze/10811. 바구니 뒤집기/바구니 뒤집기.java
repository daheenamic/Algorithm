import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int j = 0; j < m; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            while (a < b) {
                int temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;
            }
        }

        for (int l = 1; l < arr.length; l++) {
            sb.append(arr[l]).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
    }
}
