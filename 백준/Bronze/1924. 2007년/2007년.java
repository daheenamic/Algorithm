import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        LocalDate date = LocalDate.of(2007, m, d);
        int wb = date.getDayOfWeek().getValue();
        String week = "";

        switch (wb) {
            case 1: week = "MON"; break;
            case 2: week = "TUE"; break;
            case 3: week = "WED"; break;
            case 4: week = "THU"; break;
            case 5: week = "FRI"; break;
            case 6: week = "SAT"; break;
            case 7: week = "SUN"; break;
            default: week = "ERROR"; break;
        }

        sb.append(week);

        bw.write(sb.toString());
        bw.flush();
    }
}