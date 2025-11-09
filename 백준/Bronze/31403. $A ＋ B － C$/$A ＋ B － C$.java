import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        sb.append(calculate(A, B, C)).append('\n');
        sb.append(concatStrings(A, B, C));

        System.out.println(sb);

    }

    static int calculate(int a, int b, int c) {
        return a + b - c;
    }

    static int concatStrings(int a, int b, int c) {
        String str = a + "" + b;
        return Integer.parseInt(str) - c;
    }
}