import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String[] str = String.valueOf(A*B*C).split("");
        Arrays.sort(str);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (String s : str) {
                if (String.valueOf(i).equals(s)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}