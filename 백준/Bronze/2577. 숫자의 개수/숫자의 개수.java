import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int[] count = new int[10]; // 미리 0부터 9까지의 배열 만들어 놓음
        String str = Integer.toString(A * B * C);

        for (int i = 0; i < str.length(); i++) {
            // 1. 문자열로 된 숫자를 하나 가져옴
            // 2. 그 숫자를 charAt(i)으로 char 형태로 변환
            // 3. -'0'을 하여 숫자로 변환
            // 4. 해당 배열에 count를 ++함.
            count[str.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            sb.append(count[i]).append("\n");
        }

        System.out.println(sb);
    }
}