import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] intArr = new int[26];
        char[] charArr = br.readLine().toUpperCase().toCharArray();

        for (char c : charArr) {
            intArr[c - 'A']++;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] > max) {
                max = intArr[i];
                maxIndex = i;
            }
        }

        char result = (char) (maxIndex + 'A');

        int count = 0;

        for (int j : intArr) {
            if (j == max) count++;
        }

        if (count > 1) sb.append("?");
        else sb.append(result);
        
        System.out.println(sb);
    }
}