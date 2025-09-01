import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int prizeMoney = 0;

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        boolean tripleGame = false;
        boolean doubleGame = false;

        if(arr[0] == arr[1]) {
            doubleGame = true;
            prizeMoney = 1000 + ( arr[0] * 100 );
            if(arr[1] == arr[2]) {
                tripleGame = true;
                prizeMoney = 10000 + ( arr[0] * 1000 );
            }
        } else if(arr[1] == arr[2]) {
            doubleGame = true;
            prizeMoney = 1000 + ( arr[1] * 100 );
        }

        if(!tripleGame && !doubleGame) prizeMoney = arr[2] * 100;

        bw.write(prizeMoney + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
