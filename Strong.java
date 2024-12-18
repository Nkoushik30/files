import java.util.Scanner;

class Strong {
    public static void main(String[] args) {
        // Using Scanner to allow user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of factorials of digits
        while (number > 0) {
            int digit = number % 10;
            int factorial = 1;

            // Calculate factorial of the digit
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            // Add the factorial of the digit to the sum
            sum += factorial;
            number /= 10;
        }

        // Output the result
        System.out.println("Sum of factorials of digits: " + sum);

        // Check if the number is a strong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is not a Strong Number.");
        }
    }
}
