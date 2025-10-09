import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        Set<String> result = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String nm = br.readLine();
            if(set.contains(nm)) {
                result.add(nm);
            }
        }

        sb.append(result.size()).append("\n");
        for (String r : result) {
            sb.append(r).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}