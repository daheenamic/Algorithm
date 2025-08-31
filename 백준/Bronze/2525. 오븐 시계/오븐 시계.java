import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int hour = a + ( c / 60 );
        int minute = b + ( c % 60);

        if(minute >= 60) {
            minute = minute - 60;
            hour++;
        }

        if(hour >= 24) hour = hour - 24;

        bw.write(hour + " " + minute);
        bw.flush();
        bw.close();
        br.close();
    }
}
