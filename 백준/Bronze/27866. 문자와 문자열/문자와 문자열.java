import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine());
        String[] arr = str.split("");

        sb.append(arr[idx-1]);

        bw.write(sb.toString());
        bw.flush();
    }
}