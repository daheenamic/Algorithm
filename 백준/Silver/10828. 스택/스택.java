import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int x = 0;
            if (st.hasMoreTokens()) x = Integer.parseInt(st.nextToken());

            boolean isStackEmpty = stack.isEmpty();

            switch (s) {
                case "push":
                    stack.push(x);
                    break;
                case "pop":
                    sb.append(isStackEmpty? -1 : stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(isStackEmpty ? 1 : 0).append("\n");
                    break;
                case "top":
                    sb.append(isStackEmpty ? -1 : stack.peek()).append("\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}