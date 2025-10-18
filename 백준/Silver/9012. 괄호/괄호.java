import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            boolean isValid = true;

            for (Character c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isValid && stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}