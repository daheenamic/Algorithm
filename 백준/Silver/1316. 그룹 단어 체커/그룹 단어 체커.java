import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[26];
            String str = br.readLine();
            char before = ' ';
            boolean isGroupWord = true;

            for (char ch : str.toCharArray()) {
                if(ch == before) {
                    continue;
                } else {
                    if(visited[ch - 'a']) {
                        isGroupWord = false;
                        break;
                    } else {
                        visited[ch - 'a'] = true;
                    }
                }
                before = ch;
            }

            if(isGroupWord) cnt++;
        }

        System.out.println(cnt);
    }
}