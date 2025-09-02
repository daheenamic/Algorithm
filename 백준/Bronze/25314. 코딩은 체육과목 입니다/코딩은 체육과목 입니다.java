import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int longNum = a / 4;

        for (int i = 0; i < longNum; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
