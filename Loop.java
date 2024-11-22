import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            num = sc.nextInt();

            if (num > 0 && num < 100) {
                break;
            } else {
                System.out.println("Invalid input. Enter a number between 0 and 100");
            }
        }
        // Blah
        System.out.println("You have entered a valid input: " + num);
    }
}
