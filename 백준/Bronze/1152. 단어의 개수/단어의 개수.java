import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();

        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }

        StringTokenizer st = new StringTokenizer(line, " ");
        System.out.println(st.countTokens());
    }
}