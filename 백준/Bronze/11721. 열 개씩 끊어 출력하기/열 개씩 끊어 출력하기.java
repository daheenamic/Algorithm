import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split("");

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            if(i % 10 == 9) sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}