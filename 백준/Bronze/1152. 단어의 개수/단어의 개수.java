import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        StringTokenizer st = new StringTokenizer(input);
        
        System.out.println(st.countTokens());
    }
}