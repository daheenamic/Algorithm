import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[5][15];

        for(int i = 0; i < 5; i++) {
            arr[i] = String.format("%-15s", br.readLine()).toCharArray();
        }

        for(int k = 0; k < 15; k++) {
            for(int l = 0; l < 5; l++) {
                sb.append(arr[l][k]);
            }
        }

        System.out.println(sb.toString().replaceAll(" ", ""));
    }
}