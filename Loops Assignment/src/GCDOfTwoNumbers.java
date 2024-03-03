//Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98; // You can change these values to find the GCD of any two numbers

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }

    public static int gcd(int num1, int num2) {
        int smaller = Math.min(num1, num2);
        int gcd = 1;
        if (num1 < 1 || num2 < 1) {
            System.out.println("Inputs must be positive integers");
        }
        else{
        for (int i = 2; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                }
            }
        }
        return gcd;
    }
}
