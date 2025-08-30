import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int q = 0;

        if(a > 0 && b > 0) q = 1;
        else if(a < 0 && b > 0) q = 2;
        else if(a < 0 && b < 0) q = 3;
        else if(a > 0 && b < 0) q = 4;

        bw.write(q+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
