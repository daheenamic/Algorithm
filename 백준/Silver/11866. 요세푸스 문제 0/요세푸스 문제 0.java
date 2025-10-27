import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        Deque<Integer> queue = new ArrayDeque<>(n);
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        sb.append("<");

        while(!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.addLast(queue.poll());
            }
            sb.append(queue.poll());
            sb.append(queue.isEmpty() ? ">" : ", ");
        }

        System.out.println(sb.toString());
    }
}