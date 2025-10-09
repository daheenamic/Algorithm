import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String site = st2.nextToken();
            String pw = st2.nextToken();

            map.put(site, pw);
        }

        for (int i = 0; i < m; i++) {
            String siteForPw = br.readLine();
            sb.append(map.get(siteForPw)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}