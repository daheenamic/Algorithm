import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int bucketNum = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] bucket = new int[bucketNum+1];

        for (int i = 1; i < count+1; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st1.nextToken());
            int last = Integer.parseInt(st1.nextToken());
            int ballNum = Integer.parseInt(st1.nextToken());

            for (int j = first; j <= last; j++) {
                bucket[j] = ballNum;
            }
        }

        for (int i = 1; i < bucket.length; i++) {
            bw.write(bucket[i] + " ");
        }

        bw.flush();
    }
}
