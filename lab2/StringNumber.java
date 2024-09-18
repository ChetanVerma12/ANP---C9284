package lab2;

public class StringNumber {

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNumber = num;
        
        // Calculate the sum of factorial of digits
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            sum += factorial(digit);  // Add the factorial of the digit to sum
            num /= 10;  // Remove the last digit
        }
        
        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 145;  // You can change the input number here
        
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
}
