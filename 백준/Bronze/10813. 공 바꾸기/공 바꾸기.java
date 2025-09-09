import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int bucketNum = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] bucket = new int[bucketNum+1];

        for (int i = 1; i < bucket.length; i++) {
            bucket[i] = i;
        }
        
        for (int i = 1; i < count+1; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int firstIdx = Integer.parseInt(st1.nextToken());
            int secondIdx = Integer.parseInt(st1.nextToken());

            int firstIdxNum = bucket[firstIdx];
            int secondIdxNum = bucket[secondIdx];

            bucket[firstIdx] = secondIdxNum;
            bucket[secondIdx] = firstIdxNum;
        }

        for (int i = 1; i < bucket.length; i++) {
            sb.append(bucket[i]).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
    }
}
