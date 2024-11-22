import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, quadrant;

        System.out.println("Enter your x value");
        x = sc.nextInt();
        System.out.println("Enter your y value");
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y > 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }
        // Blah
        sc.close();

        System.out.println("Result: " + quadrant + " Quadrant");
    }
}