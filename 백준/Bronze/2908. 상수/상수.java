import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr1 = st.nextToken().split("");
        String[] arr2 = st.nextToken().split("");

        String a = "";
        String b = "";

        for (int i = arr1.length - 1; i >= 0; i--) {
            a += arr1[i];
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            b += arr2[i];
        }

        int n = Integer.parseInt(a);
        int m = Integer.parseInt(b);

        if (n > m) System.out.println(n);
        else System.out.println(m);
    }
}