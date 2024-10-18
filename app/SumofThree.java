import java.util.Scanner;

public class SumofThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest and largest
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Calculate the sum of the smallest and largest
        int sum = smallest + largest;

        // Display the result
        System.out.println("The sum of the smallest (" + smallest + ") and largest (" + largest + ") numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

