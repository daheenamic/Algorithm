import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        double totalScore = 0;
        double sum = 0;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(grade.equals("P")) continue;

            switch(grade) {
                case "A+":
                    sum += score * 4.5;
                    break;
                case "A0":
                    sum += score * 4.0;
                    break;
                case "B+":
                    sum += score * 3.5;
                    break;
                case "B0":
                    sum += score * 3.0;
                    break;
                case "C+":
                    sum += score * 2.5;
                    break;
                case "C0":
                    sum += score * 2.0;
                    break;
                case "D+":
                    sum += score * 1.5;
                    break;
                case "D0":
                    sum += score;
                    break;
                default:
                    sum += 0;
                    break;
            }

            totalScore += score;
        }

        System.out.printf("%.6f", sum / totalScore);
    }
}