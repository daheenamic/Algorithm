import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatiaArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String croatia = br.readLine();

        for (String c : croatiaArr) {
            if (croatia.contains(c)) {
                croatia = croatia.replace(c, "*");
            }
        }

        System.out.println(croatia.length());
    }
}