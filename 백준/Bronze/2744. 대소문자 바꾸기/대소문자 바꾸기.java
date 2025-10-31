import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr =  br.readLine().toCharArray();
        for (char c : arr) {
            if ( Character.isLowerCase(c) ) sb.append(Character.toUpperCase(c));
            if ( Character.isUpperCase(c) ) sb.append(Character.toLowerCase(c));
        }

        System.out.println(sb);
    }
}