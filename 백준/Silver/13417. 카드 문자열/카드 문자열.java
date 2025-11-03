import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCount; i++) {
            int cardCount = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Deque<Character> cards = new ArrayDeque<>();

            for (int j = 0; j < cardCount; j++) {
                char card = st.nextToken().charAt(0);
                if (cards.isEmpty()) {
                    cards.offer(card);
                } else {
                    if (card <= cards.peekFirst()) {
                        cards.offerFirst(card);
                    } else {
                        cards.offerLast(card);
                    }
                }
            }

            for (Character card : cards) {
                sb.append(card);
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}