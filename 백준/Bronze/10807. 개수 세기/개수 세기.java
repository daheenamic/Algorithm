import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int num2 = Integer.parseInt(br.readLine());

        int result = 0;
        for (Integer i : list) {
            if(i == num2) result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
