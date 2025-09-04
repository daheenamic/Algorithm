import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        sb.append(arr[0]).append(" ").append(arr[arr.length -1 ]);

        bw.write(sb.toString());
        bw.flush();
    }
}
