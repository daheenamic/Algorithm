import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[26];
        char[] input = br.readLine().toUpperCase().toCharArray();

        for (char c : input) {
            count[c - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max && count[i] > 0) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}