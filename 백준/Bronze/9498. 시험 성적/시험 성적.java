import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String grade;

        if(a >= 90 && a <= 100) grade = "A";
        else if (a >= 80 && a < 90) grade = "B";
        else if (a >= 70 && a < 80) grade = "C";
        else if (a >= 60 && a < 70) grade = "D";
        else grade = "F";

        System.out.println(grade);
    }
}