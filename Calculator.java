import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            int num = sc.nextInt();
            if (total + num >= 5) {
                int xTotal = total + num;
                System.out.println("Total after exceeding 5: " + xTotal);
                break;

            }

            total = total + num;

        }

        System.out.println("The final total before exceeding 5 is: " + total);

    }
}
