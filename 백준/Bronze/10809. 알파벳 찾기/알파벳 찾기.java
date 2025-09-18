import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();
        int[] pos = new int[26];

        Arrays.fill(pos, -1);

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - 'a';
            if(pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        for(int i = 0; i < 26; i++) {
            sb.append(pos[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}