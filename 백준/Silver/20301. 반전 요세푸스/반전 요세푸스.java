import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalPeople = Integer.parseInt(st.nextToken());
        int stepSize = Integer.parseInt(st.nextToken());
        int reverseInterval = Integer.parseInt(st.nextToken());

        System.out.println(killed(totalPeople, stepSize, reverseInterval));
    }

    public static String killed(int totalPeople, int stepSize, int reverseInterval) {
        StringBuilder sb = new StringBuilder();

        int killCount = 0;
        boolean isReversed = false;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= totalPeople; i++) {
            deque.addLast(i);
        }

        while (!deque.isEmpty()) {
            if (!isReversed) {
                for (int i = 0; i < stepSize - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                sb.append(deque.removeFirst()).append("\n");
            } else {
                for (int i = 0; i < stepSize - 1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                sb.append(deque.removeLast()).append("\n");
            }
            killCount++;
            isReversed = applyReverseInterval(killCount, reverseInterval,  isReversed);
        }
        return sb.toString();
    }

    public static boolean applyReverseInterval (int killCount, int reverseInterval, boolean isReversed) {
        if (reverseInterval <= 0) {
            return isReversed;
        }

        if (killCount % reverseInterval == 0) {
            return !isReversed;
        }

        return isReversed;
    }
}