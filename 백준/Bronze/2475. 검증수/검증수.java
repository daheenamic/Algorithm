import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int sum = 0;

        for (String s : arr) {
            int a = Integer.parseInt(s);
            sum += a * a;
        }

        System.out.println(sum % 10);
    }
}