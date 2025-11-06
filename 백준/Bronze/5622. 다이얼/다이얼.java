import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        String[] num = br.readLine().split("");
        int result = 0;

        for (String s : num) {
            for (int i = 1; i < dial.length; i++) {
                if(dial[i].contains(s)) {
                    result += i + 1;
                }
            }
        }

        System.out.print(result);
    }
}