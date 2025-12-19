import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        // 행 row, 열 cal
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        
        row++;
        col++;

        sb.append(max).append("\n");
        sb.append(row).append(" ").append(col);

        System.out.println(sb.toString());

    }
}