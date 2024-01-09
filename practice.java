import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cumulativeSum = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            cumulativeSum += number;

            if (cumulativeSum < 0) {
                System.out.println("Cumulative sum is negative. Stopping input processing.");
                break;
            }
        }

        scanner.close();
    }
}
