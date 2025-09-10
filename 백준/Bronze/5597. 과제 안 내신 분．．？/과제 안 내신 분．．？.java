import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[28];

        for (int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        for (int i = 1; i <= 30; i++) {
            if(!Arrays.asList(arr).contains(i+"")) sb.append(i).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
    }
}
