import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();
        String array[] = numbers.split(" ");

        int numArray[] = new int[3];
        for (int i = 0; i < array.length; i++) {
            numArray[i] = Integer.parseInt(array[i]);
        }

        int a = numArray[0];
        int b = numArray[1];
        int c = numArray[2];

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}