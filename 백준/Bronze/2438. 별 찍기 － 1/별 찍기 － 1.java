import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                sb.append("*");
                if(i == j) break;
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
