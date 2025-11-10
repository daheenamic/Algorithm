import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = 2 * n - 1;
        int star = 1;
        int space = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                sb.append(" ");
            }

            for(int k = 1; k <= star; k++) {
                sb.append("*");
            }

            star += 2;
            sb.append("\n");
        }

        star -= 2;

        for(int i = n-1; i >= 1; i--) {
            for(int j = 1; j <= space; j++) {
                sb.append(" ");
            }

            for(int k = 1; k <= star - 2; k++) {
                sb.append("*");
            }
            star -= 2;
            space++;

            sb.append("\n");
        }

        System.out.println(sb);
    }
}